package com.text.mining.allergyapi.util;

import com.text.mining.allergyapi.dto.ResultNameFinderDto;
import lombok.extern.log4j.Log4j;
import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;
import org.apache.commons.lang.time.StopWatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Log4j
public class NamedEntityUtils {

    public static String CleanStopWords(String inputText) {
        String[] stopWords = new String[]{
                "a", "about", "above", "after", "again", "against", "all", "am", "an", "and", "any", "are", "aren't", "as", "at", "be", "because", "been",
                "before", "being", "below", "between", "both", "but", "by", "can't", "cannot", "could", "couldn't", "did", "didn't", "do", "does",
                "doesn't", "doing", "don't", "down", "during", "each", "few", "for", "from", "further", "had", "hadn't", "has", "hasn't", "have", "haven't",
                "having", "he", "he'd", "he'll", "he's", "her", "here", "here's", "hers", "herself", "him", "himself", "his", "how", "how's", "i", "i'd",
                "i'll", "i'm", "i've", "if", "in", "into", "is", "isn't", "it", "it's", "its", "itself", "let's", "me", "more", "most", "mustn't", "my",
                "myself", "no", "nor", "not", "of", "off", "on", "once", "only", "or", "other", "ought", "our", "ours", "ourselves", "out", "over", "own",
                "same", "shan't", "she", "she'd", "she'll", "she's", "should", "shouldn't", "so", "some", "such", "than", "a", "about", "above", "after",
                "again", "against", "all", "am", "an", "and", "any", "are", "aren't", "as", "at", "be", "because", "been", "before", "being", "below",
                "between", "both", "but", "by", "can't", "cannot", "could", "couldn't", "did", "didn't", "do", "does", "doesn't", "doing", "don't", "down",
                "during", "each", "few", "for", "from", "further", "had", "hadn't", "has", "hasn't", "have", "haven't", "having", "he", "he'd", "he'll",
                "he's", "her", "here", "here's", "hers", "herself", "him", "himself", "his", "how", "how's", "i", "i'd", "i'll", "i'm", "i've", "if", "in",
                "into", "is", "isn't", "it", "it's", "its", "itself", "let's", "me", "more", "most", "mustn't", "my", "myself", "no", "nor", "not", "of",
                "off", "on", "once", "only", "or", "other", "ought", "our", "ours	ourselves", "out", "over", "own", "same", "shan't", "she", "she'd",
                "she'll", "she's", "should", "shouldn't", "so", "some", "such", "than", "that", "that's", "the", "their", "theirs", "them", "themselves",
                "then", "there", "there's", "these", "they", "they'd", "they'll", "they're", "they've", "this", "those", "through", "to", "too", "under",
                "until", "up", "very", "was", "wasn't", "we", "we'd", "we'll", "we're", "we've", "were", "weren't", "what", "what's", "when", "when's",
                "where", "where's", "which", "while", "who", "who's", "whom", "why", "why's", "with", "won't", "would", "wouldn't", "you", "you'd",
                "you'll", "you're", "you've", "your", "yours", "yourself", "yourselves", "that", "that's", "the", "their", "theirs", "them", "themselves",
                "then", "there", "there's", "these", "they", "they'd", "they'll", "they're", "they've", "this", "those", "through", "to", "too", "under",
                "until", "up", "very", "was", "wasn't", "we", "we'd", "we'll", "we're", "we've", "were", "weren't", "what", "what's", "when", "when's",
                "where", "where's", "which", "while", "who", "who's", "whom", "why", "why's", "with", "won't", "would", "wouldn't", "you", "you'd", "you'll",
                "you're", "you've", "your", "yours", "yourself", "yourselves", "a", "about", "above", "after", "again", "against", "all", "am", "an", "and",
                "any", "are", "aren't", "as", "at", "be", "because", "been", "before", "being", "below", "between", "both", "but", "by", "can't", "cannot",
                "could", "couldn't", "did", "didn't", "do", "does", "doesn't", "doing", "don't", "down", "during", "each", "few", "for", "from", "further",
                "had", "hadn't", "has", "hasn't", "have", "haven't", "having", "he", "he'd", "he'll", "he's", "her", "here", "here's", "hers", "herself",
                "him", "himself", "his", "how", "how's", "i", "i'd", "i'll", "i'm", "i've", "if", "in", "into", "is", "isn't", "it", "it's", "its", "itself",
                "let's", "me", "more", "most", "mustn't", "my", "myself", "no", "nor", "not", "of", "off", "on", "once", "only", "or", "other", "ought", "our",
                "ours	ourselves", "out", "over", "own", "same", "shan't", "she", "she'd", "she'll", "she's", "should", "shouldn't", "so", "some", "such",
                "than", "that", "that's", "the", "their", "theirs", "them", "themselves", "then", "there", "there's", "these", "they", "they'd", "they'll",
                "they're", "they've", "this", "those", "through", "to", "too", "under", "until", "up", "very", "was", "wasn't", "we", "we'd", "we'll", "we're",
                "we've", "were", "weren't", "what", "what's", "when", "when's", "where", "where's", "which", "while", "who", "who's", "whom", "why", "why's",
                "with", "won't", "would", "wouldn't", "you", "you'd", "you'll", "you're", "you've", "your", "yours", "yourself", "yourselves"};

        Comparator<String> compByLength = Comparator.comparingInt(String::length).reversed();
        String text = Arrays.stream(stopWords).sorted(compByLength).collect(Collectors.joining("|"));

        Pattern pattern = Pattern.compile("\\b(?:" + text + ")\\b\\s*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputText);
        return matcher.replaceAll("");
    }

    public static String cleanNumbersAndSpecialCharacters(String inputText) {
        return inputText.replaceAll("[^A-Za-z]", " ");
    }

    public static String[] tokenizeInputText(String inputText) throws IOException {
        StopWatch stopWatch = new StopWatch();
        try {
            stopWatch.start();
            InputStream modelInToken = new FileInputStream("src/main/resources/en-token.bin");
            TokenizerModel modelToken = new TokenizerModel(modelInToken);
            Tokenizer tokenizer = new TokenizerME(modelToken);
            return tokenizer.tokenize(inputText);

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }finally {
            log.info("NamedEntityUtils.tokenizeInputText() | ExecutionTime: " + stopWatch.getTime());
        }
    }

    public static ResultNameFinderDto findNames(String[] tokens) throws IOException {
        StopWatch stopWatch = new StopWatch();
        try {
            stopWatch.start();
            InputStream modelIn = new FileInputStream("src/main/resources/ner-custom-model.bin");
            TokenNameFinderModel model = new TokenNameFinderModel(modelIn);
            NameFinderME nameFinder = new NameFinderME(model);
            Span[] spans = nameFinder.find(tokens);

            return ResultNameFinderDto.builder()
                    .spans(spans)
                    .spansProbability(nameFinder.probs(spans))
                    .build();

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            log.info("NamedEntityUtils.findNames() | ExecutionTime: " + stopWatch.getTime());
        }
    }

    public static void main(String[] args) {

        InputStream modelInToken = null;
        InputStream modelIn = null;

        try {

            Path path = Paths.get("src/main/resources/notes.txt");
            List<String> lines = Files.readAllLines(path);
            String text = String.join("\n", lines);

            text = NamedEntityUtils.CleanStopWords(text);
            text = text.replaceAll("[^A-Za-z]", " ");

            //1. convert sentence into tokens
            modelInToken = new FileInputStream("src/main/resources/en-token.bin");
            TokenizerModel modelToken = new TokenizerModel(modelInToken);
            Tokenizer tokenizer = new TokenizerME(modelToken);
            String tokens[] = tokenizer.tokenize(text);

            //2. find names
            modelIn = new FileInputStream("src/main/resources/ner-custom-model.bin");
            TokenNameFinderModel model = new TokenNameFinderModel(modelIn);
            NameFinderME nameFinder = new NameFinderME(model);

            Span nameSpans[] = nameFinder.find(tokens);

            //find probabilities for names
            double[] spanProbs = nameFinder.probs(nameSpans);

            //3. print names
            for (int i = 0; i < nameSpans.length; i++) {
                System.out.println("Span: " + nameSpans[i].toString());
                System.out.println("Covered text is: " + tokens[nameSpans[i].getStart()]);
                System.out.println("Probability is: " + spanProbs[i]);
                System.out.println("-------------------------------------------------------------------------------");
            }
            //Span: [0..2) person
            //Covered text is: Jack London
            //Probability is: 0.7081556539712883
        } catch (Exception ex) {
        } finally {
            try {
                if (modelInToken != null) modelInToken.close();
            } catch (IOException e) {
            }
            ;
            try {
                if (modelIn != null) modelIn.close();
            } catch (IOException e) {
            }
            ;
        }
    }

}

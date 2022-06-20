package com.text.mining.allergyapi.training;

import com.text.mining.allergyapi.util.NamedEntityUtils;
import opennlp.tools.stemmer.PorterStemmer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StemmerText {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("<file_path>");
        List<String> lines = Files.readAllLines(path);
        String text = String.join("\n", lines);

        String[] tokenizedInputText = NamedEntityUtils.tokenizeInputText(text);

        PorterStemmer ps = new PorterStemmer();

        List<String> tokensStemmered = new ArrayList<>();
        for (String t : tokenizedInputText) {
            System.out.println("Antes: " + t + " Depois: " + ps.stem(t));
            tokensStemmered.add(ps.stem(t));
        }

        Files.write(Path.of("src/main/resources/dictionary.txt"), tokensStemmered);
    }

}

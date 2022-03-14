package com.text.mining.allergyapi.service;

import com.text.mining.allergyapi.amqp.Producer;
import com.text.mining.allergyapi.dto.MessageQueueDto;
import com.text.mining.allergyapi.dto.ResultNameFinderDto;
import com.text.mining.allergyapi.dto.WordDto;
import com.text.mining.allergyapi.enums.WordType;
import com.text.mining.allergyapi.util.NamedEntityUtils;
import lombok.extern.log4j.Log4j;
import org.apache.commons.lang.time.StopWatch;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Log4j
@Service
public class NamedEntityService {

    private final Producer producer;

    public NamedEntityService(Producer producer) {
        this.producer = producer;
    }

    public void process(MessageQueueDto messageQueueDto) {
        try {
            String inputText = preprocessing(messageQueueDto.getDataDto().getText());
            String[] tokens = NamedEntityUtils.tokenizeInputText(inputText);
            ResultNameFinderDto result = NamedEntityUtils.findNames(tokens);
            prepareData(messageQueueDto, result, tokens);
            sendMessage(messageQueueDto);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void prepareData(MessageQueueDto messageQueueDto, ResultNameFinderDto result, String[] tokens) {
        List<WordDto> words = new ArrayList<>();
        for (int i = 0; i < result.getSpans().length; i++) {
            System.out.println("Span: " + result.getSpans()[i].toString());
            System.out.println("Covered text is: " + tokens[result.getSpans()[i].getStart()]);
            System.out.println("Probability is: " + result.getSpansProbability()[i]);
            System.out.println("-------------------------------------------------------------------------------");

            WordDto wordDto = new WordDto();
            wordDto.setProbability(result.getSpansProbability()[i]);
            wordDto.setWordtext(tokens[result.getSpans()[i].getStart()]);

            switch (result.getSpans()[i].getType()) {
                case "alergia":
                    wordDto.setType(WordType.ALLERGY);
                    break;
                case "sintoma":
                    wordDto.setType(WordType.SYMPTOM);
                    break;
                case "substancia":
                    wordDto.setType(WordType.SUBSTANCE);
            }
            words.add(wordDto);
        }
        messageQueueDto.setWords(words);
    }

    private String preprocessing(String inputText) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            inputText = NamedEntityUtils.CleanStopWords(inputText);
            inputText = NamedEntityUtils.cleanNumbersAndSpecialCharacters(inputText);
            return inputText;
        } catch (Exception e) {
            throw e;
        } finally {
            log.info("NamedEntityService.preprocessing() | Final Time: " + stopWatch.getTime());
        }
    }

    private void sendMessage(MessageQueueDto messageQueueDto) {
        this.producer.sendMessage("parser_queue", messageQueueDto);
    }

}

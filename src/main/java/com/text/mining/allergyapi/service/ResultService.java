package com.text.mining.allergyapi.service;

import com.text.mining.allergyapi.dto.MessageQueueDto;
import com.text.mining.allergyapi.enums.WordType;
import com.text.mining.allergyapi.model.Results;
import com.text.mining.allergyapi.repository.ResultsRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ResultService {

    private final ResultsRepository resultsRepository;

    public ResultService(ResultsRepository resultsRepository) {
        this.resultsRepository = resultsRepository;
    }

    void saveResult(MessageQueueDto messageQueueDto){
        String fileId = UUID.randomUUID().toString();
        List<Results> results = new ArrayList<>();
        messageQueueDto.getWords().forEach(word -> {

            if (word.getType().equals(WordType.ALLERGY)) {
                results.add(Results.builder()
                        .probability(BigDecimal.valueOf(word.getProbability()).setScale(2, RoundingMode.HALF_UP))
                        .type(word.getType())
                        .wordtext(word.getWordtext())
                        .fileId(fileId)
                        .build());
            }
        });

        this.resultsRepository.saveAll(results);
    }

}

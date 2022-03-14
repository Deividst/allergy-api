package com.text.mining.allergyapi.service;

import com.text.mining.allergyapi.amqp.Producer;
import com.text.mining.allergyapi.dto.MessageQueueDto;
import com.text.mining.allergyapi.dto.TextDataDto;
import com.text.mining.allergyapi.util.FileUtils;
import lombok.extern.log4j.Log4j;
import org.apache.commons.lang.time.StopWatch;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Log4j
@Service
public class FileProcessorService {

    private final Producer producer;

    public FileProcessorService(Producer producer) {
        this.producer = producer;
    }

    public void process(MultipartFile file, String url, String token) throws IOException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        String inputText = FileUtils.readFile(file.getInputStream());
        this.producer.sendMessage("mining_queue", MessageQueueDto.builder()
                .dataDto(TextDataDto.builder()
                        .text(inputText)
                        .token(token)
                        .url(url)
                        .build())
                .build());
        log.info("FileProcessorService.process() | ExecutionTime: " + stopWatch.getTime());
    }

}

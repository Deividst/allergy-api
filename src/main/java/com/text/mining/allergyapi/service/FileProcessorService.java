package com.text.mining.allergyapi.service;

import com.text.mining.allergyapi.amqp.Producer;
import com.text.mining.allergyapi.dto.MessageQueueDto;
import com.text.mining.allergyapi.dto.TextDataDto;
import com.text.mining.allergyapi.util.FileUtils;
import com.text.mining.allergyapi.util.LogUtils;
import lombok.extern.log4j.Log4j;
import org.apache.commons.lang.time.StopWatch;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;

@Log4j
@Service
public class FileProcessorService {

    private final Producer producer;
    private final MedicalInstitutionService medicalInstitutionService;

    public FileProcessorService(Producer producer, MedicalInstitutionService medicalInstitutionService) {
        this.producer = producer;
        this.medicalInstitutionService = medicalInstitutionService;
    }

    public void process(MultipartFile file) throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String inputText = FileUtils.readFile(file.getInputStream());
        this.producer.sendMessage("mining_queue", MessageQueueDto.builder()
                .dataDto(TextDataDto.builder()
                        .text(inputText)
                        .institution(medicalInstitutionService.findInstitutionByUserName(authentication.getName()))
                        .build())
                .words(new ArrayList<>())
                .build());
        log.info("FileProcessorService.process() | Execution Time: " + LogUtils.logExecutionTime());
    }

}

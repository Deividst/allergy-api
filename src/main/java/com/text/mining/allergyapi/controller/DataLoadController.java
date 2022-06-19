package com.text.mining.allergyapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.text.mining.allergyapi.amqp.Producer;
import com.text.mining.allergyapi.dto.MessageQueueDto;
import com.text.mining.allergyapi.dto.RequestDataDto;
import com.text.mining.allergyapi.dto.TextDataDto;
import com.text.mining.allergyapi.service.FileProcessorService;
import com.text.mining.allergyapi.service.MedicalInstitutionService;
import com.text.mining.allergyapi.util.LogUtils;
import lombok.extern.log4j.Log4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;


@Log4j
@Controller
@RequestMapping(path = "/v1/dataload")
public class DataLoadController {

    private final RabbitTemplate rabbitTemplate;
    private final FileProcessorService fileProcessorService;
    private final ObjectMapper objectMapper;
    private final MedicalInstitutionService medicalInstitutionService;

    public DataLoadController(RabbitTemplate rabbitTemplate, FileProcessorService fileProcessorService, ObjectMapper objectMapper,
                              MedicalInstitutionService medicalInstitutionService) {
        this.rabbitTemplate = rabbitTemplate;
        this.fileProcessorService = fileProcessorService;
        this.objectMapper = objectMapper;
        this.medicalInstitutionService = medicalInstitutionService;
    }

    @PostMapping("/upload")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void upload(@RequestBody RequestDataDto requestDataDto) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        new Producer(rabbitTemplate, objectMapper)
                .sendMessage("mining_queue", MessageQueueDto.builder()
                .dataDto(TextDataDto.builder()
                        .text(requestDataDto.getText())
                        .institution(medicalInstitutionService.findInstitutionByUserName(authentication.getName()))
                        .build())
                        .words(new ArrayList<>())
                .build());
    }

    @PostMapping("/uploadfile")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void upload(@RequestParam("file") MultipartFile file) {
        log.info("DataLoadController.upload() | Execution Time: " + LogUtils.logExecutionTime());
        try {
            this.fileProcessorService.process(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

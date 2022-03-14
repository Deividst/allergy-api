package com.text.mining.allergyapi.amqp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.text.mining.allergyapi.dto.MessageQueueDto;
import com.text.mining.allergyapi.service.ConverterService;
import com.text.mining.allergyapi.service.NamedEntityService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ParserConsumer {

    private final ObjectMapper objectMapper;
    private final ConverterService converterService;

    public ParserConsumer(ObjectMapper objectMapper, ConverterService converterService) {
        this.objectMapper = objectMapper;
        this.converterService = converterService;
    }

    @RabbitListener(queues = "parser_queue")
    private void consumidor(String message) throws JsonProcessingException {
        MessageQueueDto messageQueueDto = objectMapper.readValue(message, MessageQueueDto.class);
        converterService.process(messageQueueDto);
    }

}

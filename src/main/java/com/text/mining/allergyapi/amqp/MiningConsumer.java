package com.text.mining.allergyapi.amqp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.text.mining.allergyapi.dto.MessageQueueDto;
import com.text.mining.allergyapi.service.NamedEntityService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MiningConsumer {

    private final ObjectMapper objectMapper;
    private final NamedEntityService namedEntityService;

    public MiningConsumer(ObjectMapper objectMapper, NamedEntityService namedEntityService) {
        this.objectMapper = objectMapper;
        this.namedEntityService = namedEntityService;
    }

    @RabbitListener(queues = "mining_queue")
    private void consumidor(String message) throws JsonProcessingException {
        MessageQueueDto messageQueueDto = objectMapper.readValue(message, MessageQueueDto.class);
        namedEntityService.process(messageQueueDto);
    }

}

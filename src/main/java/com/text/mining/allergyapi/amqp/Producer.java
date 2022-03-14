package com.text.mining.allergyapi.amqp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.text.mining.allergyapi.dto.MessageQueueDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper objectMapper;

    public Producer(RabbitTemplate rabbitTemplate, ObjectMapper objectMapper) {
        this.rabbitTemplate = rabbitTemplate;
        this.objectMapper = objectMapper;
    }

    public void sendMessage(String queueName, MessageQueueDto mensagem) {
        try {
            String message = this.objectMapper.writeValueAsString(mensagem);
            this.rabbitTemplate.convertAndSend(queueName, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
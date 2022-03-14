package com.text.mining.allergyapi.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {
    private static final String EXCHANGE_NAME = "amq.direct";
    private static final String MINING_QUEUE = "mining_queue";
    private static final String PARSER_QUEUE = "parser_queue";

    @Bean
    public Queue miningQueue() {
        return new Queue(MINING_QUEUE, false);
    }

    @Bean
    public Queue parserQueue() {
        return new Queue(PARSER_QUEUE, false);
    }

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }

    @Bean
    public Binding miningBinding(Queue miningQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(miningQueue).to(directExchange).with(MINING_QUEUE);
    }

    @Bean
    public Binding parserBinding(Queue parserQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(parserQueue).to(directExchange).with(PARSER_QUEUE);
    }

    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }
}

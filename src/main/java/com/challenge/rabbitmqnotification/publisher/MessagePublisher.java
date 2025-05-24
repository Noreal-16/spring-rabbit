package com.challenge.rabbitmqnotification.publisher;

import com.challenge.rabbitmqnotification.config.RabbitConfig;
import com.challenge.rabbitmqnotification.model.SimpleMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessagePublisher {
    private final RabbitTemplate rabbitTemplate;

    public MessagePublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String messageText) {
        SimpleMessage message = new SimpleMessage(messageText);
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE, RabbitConfig.ROUTING_KEY, message);
        log.info("📤 Message sent to RabbitMQ: {}", messageText);
    }
}

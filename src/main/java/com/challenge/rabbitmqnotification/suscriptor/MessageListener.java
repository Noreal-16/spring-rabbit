package com.challenge.rabbitmqnotification.suscriptor;

import com.challenge.rabbitmqnotification.config.RabbitConfig;
import com.challenge.rabbitmqnotification.model.SimpleMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageListener {
    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void receiveMessage(SimpleMessage message) {
        log.info("📥 Message received: {}", message);
    }
}

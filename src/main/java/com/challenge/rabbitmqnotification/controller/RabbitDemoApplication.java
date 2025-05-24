package com.challenge.rabbitmqnotification.controller;

import com.challenge.rabbitmqnotification.publisher.MessagePublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class RabbitDemoApplication {

    private final MessagePublisher publisher;

    public RabbitDemoApplication(MessagePublisher publisher) {
        this.publisher = publisher;
    }

    public static void main(String[] args) {
        SpringApplication.run(RabbitDemoApplication.class, args);
    }

    @PostMapping("/send")
    public String send(@RequestParam String message) {
        publisher.sendMessage(message);
        return "Mensaje enviado: " + message;
    }

}

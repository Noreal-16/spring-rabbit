# 🐰 RabbitMQ Notifier con Spring Boot

Este proyecto basico se demuestra cómo implementar un publicador y suscriptor usando Spring Boot y RabbitMQ, utilizando mensajes en formato JSON con Jackson2JsonMessageConverter

##  Tecnologías

- Java 17+
- Spring Boot 3.x
- Spring AMQP (RabbitMQ)
- RabbitMQ (dockerizado)
- JSON (Jackson) para serialización

# 🐳 Docker Compose para RabbitMQ


services:

  rabbitmq:

    image: rabbitmq:3-management

    container_name: rabbitmq

    ports:

      - "5672:5672"

      - "15672:15672" # UI en localhost:15672

    environment:

      RABBITMQ_DEFAULT_USER: guest

      RABBITMQ_DEFAULT_PASS: guest

package com.mzrt.rabbitmq_publisher.controller;

import com.mzrt.rabbitmq_publisher.config.RabbitMQConfig;
import com.mzrt.rabbitmq_publisher.model.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.mzrt.rabbitmq_publisher.config.RabbitMQConfig.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("publish")
public class PublisherController {

    private final RabbitTemplate rabbitTemplate;

    @PostMapping("/colors")
    public String publishColor(@RequestBody Model.Color color){
        this.rabbitTemplate.convertAndSend(EXCHANGE_NAME, ROUTING_KEY_COLOR, color);
        return "Color message sent successfully";
    }

    @PostMapping("/shape")
    public String publishShape(@RequestBody Model.Shape shape){
        this.rabbitTemplate.convertAndSend(EXCHANGE_NAME, ROUTING_KEY_SHAPE, shape);
        return "Shape message sent successfully";
    }

}

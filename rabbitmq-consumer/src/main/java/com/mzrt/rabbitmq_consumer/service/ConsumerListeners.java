package com.mzrt.rabbitmq_consumer.service;

import com.mzrt.rabbitmq_consumer.config.RabbitMQConfig;
import com.mzrt.rabbitmq_consumer.model.Model;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ConsumerListeners {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_COLOR)
    public void readColorMessage(Model.Color color){
        log.info("Receiving color:{}", color );
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_SHAPE)
    public void readShapeMessage(Model.Shape shape){
        log.info("Receiving shape:{}", shape);
    }
}

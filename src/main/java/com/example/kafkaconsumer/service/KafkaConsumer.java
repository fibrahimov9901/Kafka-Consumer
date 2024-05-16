package com.example.kafkaconsumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my_first_topic", groupId = "kafka-group")
    public void consumeCurrency(String s){
        log.info("Currency data: {} ", s);
    }
}
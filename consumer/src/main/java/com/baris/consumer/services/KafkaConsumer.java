package com.baris.consumer.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test", groupId = "group_id")
    public void consume(String user) {
        System.out.println("Consumed: " + user);
    }

}
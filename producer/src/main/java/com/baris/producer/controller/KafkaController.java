package com.baris.producer.controller;

import com.baris.producer.model.User;
import com.baris.producer.services.KafkaProducer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class KafkaController {
    private final KafkaProducer kafkaProducer;

    @PostMapping("/user")
    public void sendUserToKafka(@RequestBody User user) {
        this.kafkaProducer.sendUser(user);
    }
}
package com.example.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserProducerController {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    @PostMapping
    public String sendMessage(@RequestBody User user) {
        kafkaTemplate.send("users", user);
        System.out.println("Sent user: " + user.getName());
        return "Sent user: " + user.getName();
    }
}

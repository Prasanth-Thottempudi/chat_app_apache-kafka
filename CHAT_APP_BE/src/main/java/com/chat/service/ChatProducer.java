package com.chat.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChatProducer {
    
    private static final String TOPIC = "chat-messages";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ChatProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC,"1232", message);
    }
}


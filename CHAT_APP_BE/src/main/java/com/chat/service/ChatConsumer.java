package com.chat.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChatConsumer {
	
	@KafkaListener(topics = "chat-messages", groupId = "chat-consumer-group")
    public void consume(ConsumerRecord<String, String> record) {
        String userId = record.key(); 
        String message = record.value();      
        System.out.println("Received message: " + message+"---------"+userId);
    }
    

}

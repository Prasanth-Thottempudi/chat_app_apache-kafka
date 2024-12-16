package com.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.service.ChatConsumer;
import com.chat.service.ChatProducer;

@RestController
@RequestMapping("/chat")
public class ChatController {
	
	@Autowired
	private ChatProducer chatProducer;
	
	@Autowired
	private ChatConsumer chatConsumer;
	
	@PostMapping("/send")
    public void sendMessage(@RequestBody String message) {
        chatProducer.sendMessage(message);
    }
	
	

}

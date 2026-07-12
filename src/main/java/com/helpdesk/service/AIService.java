package com.helpdesk.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AIService {

	
	private ChatClient chatClient;
	
	public AIService(ChatClient chatClient) {
		
		this.chatClient = chatClient;
	}
	
	
	public String getResponseFromAssistant(String query) {
		
		return this.chatClient.prompt()
				.user(query)
				.call()
				.content();
	}
}

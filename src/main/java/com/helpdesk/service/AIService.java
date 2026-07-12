package com.helpdesk.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helpdesk.tools.TicketDatabaseTool;

@Service
public class AIService {

	
	private ChatClient chatClient;
	
	@Autowired
	private TicketDatabaseTool ticketDatabaseTool;
	
	public AIService(ChatClient chatClient) {
		
		this.chatClient = chatClient;
	}
	
	
	public String getResponseFromAssistant(String query) {
		
		return this.chatClient.prompt()
				.tools(ticketDatabaseTool)
				.user(query)
				.call()
				.content();
	}
}

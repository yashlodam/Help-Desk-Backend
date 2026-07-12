package com.helpdesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helpdesk.service.AIService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/ai")
public class AIController {

	@Autowired
	private AIService aiService;
	
	@PostMapping
	public ResponseEntity<String> getResponse(@RequestBody String query){
		
		return ResponseEntity.ok(aiService.getResponseFromAssistant(query));
		
	}
}

package com.helpdesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helpdesk.entity.Ticket;
import com.helpdesk.repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository repository;
	
	
	//create ticket
	
	public Ticket createTicket(Ticket ticket) {
		
		return repository.save(ticket);
	}
	
	
	//get ticket logic
	
	public Ticket getTicket(Long ticketId) {
		
		return repository.findById(ticketId).orElseThrow(()-> new RuntimeException("Ticket not found with given id"));
		
	}
	
	
	//get ticket by username
	
	public Ticket getTicketByUsernName(String username) {
		return repository.findByUsername(username).orElseThrow(()-> new RuntimeException("Ticket not found for given username"));
	}
}

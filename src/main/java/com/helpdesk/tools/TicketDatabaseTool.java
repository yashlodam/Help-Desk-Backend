package com.helpdesk.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.helpdesk.entity.Ticket;
import com.helpdesk.service.TicketService;

@Component
public class TicketDatabaseTool {

	@Autowired
	private TicketService ticketService;
	
	
	// create ticket tool
	@Tool(description = "This tool helps to create new ticket in database.")
	public Ticket createTicketTool(@ToolParam(description = "Ticket details.") Ticket ticket) {
		
		return ticketService.createTicket(ticket);
	}
	
	
	// get ticket using username
	
	@Tool(description = "This tool help to get ticket by username.")
	public Ticket getTicketByUserName(@ToolParam(description = "usernname whose ticket is required.") String username) {
		
		return ticketService.getTicketByUsernName(username);
	}
	
	//update ticket 
	@Tool(description = "This tool helps to update ticket.")
	public Ticket updateTicket(@ToolParam(description = "new ticket details with ticket id.") Ticket ticket) {
		
		return ticketService.updateTicket(ticket);
	}
	
	
}

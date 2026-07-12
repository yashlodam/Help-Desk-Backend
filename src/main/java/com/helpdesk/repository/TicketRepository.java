package com.helpdesk.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpdesk.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

	Optional<Ticket> findById(Long ticketId);
	
	Optional<Ticket> findByUsername(String username);
	
}

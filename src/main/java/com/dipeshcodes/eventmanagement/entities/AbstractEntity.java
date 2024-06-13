package com.dipeshcodes.eventmanagement.entities;

import java.time.Instant;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AbstractEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant created;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instant getCreated() {
		return created;
	}
	public void setCreated(Instant created) {
		this.created = created;
	}

}

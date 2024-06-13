package com.dipeshcodes.eventmanagement.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Participant extends AbstractEntity {
	
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String email;
	private Boolean checkedIn;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="event_id", nullable = false, updatable = false)
	private Event event;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	
}

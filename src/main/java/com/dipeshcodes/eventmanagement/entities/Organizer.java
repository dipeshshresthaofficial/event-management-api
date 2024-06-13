package com.dipeshcodes.eventmanagement.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

@Entity
public class Organizer extends AbstractEntity{

	private String name;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "organizer", cascade = CascadeType.ALL)
	private Set<Event> events;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Event> getEvents() {
		return events;
	}
	public void setEvents(Set<Event> events) {
		this.events = events;
	}
}

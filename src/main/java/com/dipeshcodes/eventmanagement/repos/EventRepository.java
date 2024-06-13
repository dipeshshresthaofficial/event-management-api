package com.dipeshcodes.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.dipeshcodes.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}

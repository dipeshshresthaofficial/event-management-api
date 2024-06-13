package com.dipeshcodes.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.dipeshcodes.eventmanagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}

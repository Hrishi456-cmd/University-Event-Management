package com.geekster.University.Event.Management.repository;

import com.geekster.University.Event.Management.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, String> {

}

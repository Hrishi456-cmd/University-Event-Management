package com.geekster.University.Event.Management.service;

import com.geekster.University.Event.Management.model.Event;
import com.geekster.University.Event.Management.repository.EventRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    public Optional<Event> getEventById(String eventId) {
        return eventRepository.findById(eventId);
    }
}

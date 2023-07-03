package com.geekster.University.Event.Management.controller;

import com.geekster.University.Event.Management.model.Event;
import com.geekster.University.Event.Management.service.EventService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public ResponseEntity<Event> addEvent(@Validated @RequestBody Event event) {
        Event addedEvent = eventService.addEvent(event);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedEvent);
    }

    @GetMapping("/{eventId}")
    public ResponseEntity<Event> getEventById(@PathVariable String eventId) {
        return eventService.getEventById(eventId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

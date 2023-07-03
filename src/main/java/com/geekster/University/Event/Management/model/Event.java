package com.geekster.University.Event.Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Event {
    @Id
    private String eventId;

    @NotBlank(message = "Event name is required")
    private String eventName;

    @NotBlank(message = "Location of event is required")
    private String locationOfEvent;

    @NotBlank(message = "Date is required")
    private String date;

    @NotBlank(message = "Start time is required")
    private String startTime;

    @NotBlank(message = "End time is required")
    private String endTime;
}

package com.example.eventmanagementsystem.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanagementsystem.service.EventService;
import com.example.eventmanagementsystem.entity.Events;

@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/events")
public class EventController {
	private final EventService eventService;
	
	
	
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }
	
	@PostMapping
    public Events createEvents(@RequestBody Events events) {
        return eventService.saveEvents(events);
    }
	
	@GetMapping("/{id}")
    public Events getEventsById(@PathVariable Long id) {
        return eventService.getEventsById(id);
    }
	
	@PutMapping("/{id}")
    public Events updateEvents(@PathVariable Long id, @RequestBody Events events) {
        return eventService.updateEvents(id, events);
    }
	
	@DeleteMapping("/{id}")
    public void deleteEvents(@PathVariable Long id) {
        eventService.deleteEvents(id);
    } 

}

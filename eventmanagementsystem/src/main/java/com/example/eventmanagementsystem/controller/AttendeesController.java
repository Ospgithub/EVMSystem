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

import com.example.eventmanagementsystem.entity.Attendees;
import com.example.eventmanagementsystem.service.AttendeesService;

@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/attendees")
public class AttendeesController {
	private final AttendeesService attendeesService;
	
	 public AttendeesController(AttendeesService attendeesService) {
	        this.attendeesService = attendeesService;
	    }
		
	 
	 @PostMapping
	    public Attendees createAttendees(@RequestBody Attendees attendees) {
	        return attendeesService.saveAttendees(attendees);
	 }
	
	 
	 @GetMapping("/{id}")
	    public Attendees getAttendeeById(@PathVariable Long id) {
	        return attendeesService.getAttendeesById(id);
	    }
	 
	 
	 
	 @PutMapping("/{id}")
	    public Attendees updateAttendee(@PathVariable Long id, @RequestBody Attendees attendees) {
	        return attendeesService.updateAttendees(id, attendees);
	    }
	 
	 
	 
	 @DeleteMapping("/{id}")
	    public void deleteAttendee(@PathVariable Long id) {
	        attendeesService.deleteAttendees(id);
	    }
	

}
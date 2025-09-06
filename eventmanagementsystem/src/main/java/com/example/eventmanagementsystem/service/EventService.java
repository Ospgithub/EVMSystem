package com.example.eventmanagementsystem.service;

import java.util.List;

import com.example.eventmanagementsystem.entity.Events;

public interface EventService {
	
Events saveEvents(Events events);  
	
    List<Events> getAllEvents();   
    
    Events getEventsById(Long id);  
    
    Events updateEvents(Long id, Events events); 
    
    void deleteEvents(Long id);


}

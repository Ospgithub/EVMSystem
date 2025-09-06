package com.example.eventmanagementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanagementsystem.service.EventService;
import com.example.eventmanagementsystem.entity.Events;
import com.example.eventmanagementsystem.repository.EventRepo;

@Service
public class EServiceImp implements EventService {

	@Autowired
	private EventRepo eventRepo;
	
	@Override
    public Events saveEvents(Events events) {
        return eventRepo.save(events);
    }


    @Override
    public Events getEventsById(Long id) {
        return eventRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found with id " + id));
    }


    @Override
    public List<Events> getAllEvents() {
        return eventRepo.findAll();
    }


    @Override
    public Events updateEvents(Long id, Events events) {
        Events existingEvents = eventRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id " + id));

        existingEvents.setName(events.getName());
        existingEvents.setPhone(events.getPhone());
        existingEvents.setType(events.getType());
        existingEvents.setLocation(events.getLocation());;
        

        return eventRepo.save(existingEvents);
    }


    @Override
    public void deleteEvents(Long id) {
        eventRepo.deleteById(id);
    }

}

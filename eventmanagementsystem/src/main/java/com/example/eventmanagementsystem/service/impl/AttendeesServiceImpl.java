package com.example.eventmanagementsystem.service.impl;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanagementsystem.entity.Attendees;
import com.example.eventmanagementsystem.repository.AttendeesRepository;
import com.example.eventmanagementsystem.service.AttendeesService;

@Service
public class AttendeesServiceImpl implements AttendeesService {
	
	
	
	@Autowired
	private AttendeesRepository attendeesRepository;
	
	
	@Override
	public Attendees saveAttendees(Attendees attendees) {
        return attendeesRepository.save(attendees);
	}
	
	@Override
	 public Attendees getAttendeesById(Long id) {
        return attendeesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Attendees not found with id " + id));
    }
	
	@Override
	 public List<Attendees> getAllAttendees() {
	        return attendeesRepository.findAll();
	    }
	
	
	
	@Override
	 public Attendees updateAttendees(Long id, Attendees attendees) {
	        Attendees existingAttendees = attendeesRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Attendees not found with id " + id));

	        existingAttendees.setName(attendees.getName());
	        existingAttendees.setEmail(attendees.getEmail());
	        existingAttendees.setPhone(attendees.getPhone());

	        return attendeesRepository.save(existingAttendees);
	    }
	   
	
	@Override
	   public void deleteAttendees(Long id) {
	        attendeesRepository.deleteById(id);
	    }

}

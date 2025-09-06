package com.example.eventmanagementsystem.service;

import java.util.List;

import com.example.eventmanagementsystem.entity.Attendees;

public interface AttendeesService {
	
	Attendees saveAttendees(Attendees attendees);
	List<Attendees> getAllAttendees();
	
	Attendees getAttendeesById(Long id);
	
	Attendees updateAttendees(Long id, Attendees attendees);
	
	void deleteAttendees(Long id);
}

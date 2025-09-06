package com.example.eventmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanagementsystem.entity.Organizers;
import com.example.eventmanagementsystem.repository.OrganizersRepository;


@Service
public class OrganizersService {

	
	@Autowired 
	private OrganizersRepository organizersRepository;
	
	
	 
	    public Organizers saveOrganizers(Organizers organizers) {
	        return organizersRepository.save(organizers);
	    }

	    
	    public Organizers getOrganizerById(Long id) {
	        return organizersRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Organizers not found with id " + id));
	    }
	    
	    
	    
	    public List<Organizers> getAllOrganizers() {
	        return organizersRepository.findAll();
	    }

	    
	    public Organizers updateOrganizers(Long id, Organizers organizer) {
	        Organizers existingOrganizers = organizersRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Organizers not found with id " + id));
	        
	        

	        existingOrganizers.setName(organizer.getName());
	        existingOrganizers.setEmail(organizer.getEmail());
	        existingOrganizers.setPhone(organizer.getPhone());

	        return organizersRepository.save(existingOrganizers);
	    }
	    
	    
	    public void deleteOrganizers(Long id) {
	        organizersRepository.deleteById(id);
	    }
	    
}

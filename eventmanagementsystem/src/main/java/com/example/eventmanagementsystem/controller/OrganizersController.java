package com.example.eventmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanagementsystem.entity.Organizers;
import com.example.eventmanagementsystem.service.OrganizersService;

@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/organizers")

public class OrganizersController {
	@Autowired
	private final OrganizersService organizersService;
	
	public OrganizersController(OrganizersService organizersServie, OrganizersService organizersService) {
		this.organizersService = organizersService;
	}
	
	@PostMapping
    public Organizers createOrganizers(@RequestBody Organizers organizers) {
        return organizersService.saveOrganizers(organizers);
    }
	
    @GetMapping("/{id}")
    public Organizers getOrganizersById(@PathVariable Long id) {
        return organizersService.getOrganizerById(id);
    }

	
	@PutMapping("/{id}")
    public Organizers updateOrganizers(@PathVariable Long id, @RequestBody Organizers organizers) {
        return organizersService.updateOrganizers(id, organizers);
        
     
	
	}

	
	@DeleteMapping("/{id}")
    public void deleteOrganizers(@PathVariable Long id) {
        organizersService.deleteOrganizers(id);
    } 
	
	

}

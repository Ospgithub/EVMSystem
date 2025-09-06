package com.example.eventmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventmanagementsystem.entity.Organizers;

@Repository  
public interface OrganizersRepository extends JpaRepository<Organizers, Long> {

}

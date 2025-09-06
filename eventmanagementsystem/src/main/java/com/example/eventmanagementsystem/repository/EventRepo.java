package com.example.eventmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventmanagementsystem.entity.Events;

@Repository
public interface EventRepo extends JpaRepository<Events, Long> {

}

package com.example.eventmanagementsystem.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;


@Entity
@Table(name = "attendees")
public class Attendees {
	
	 @Id  
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 private Long id;   
	 @Column(nullable = false)
	 private String name;
	 @Column(nullable = false)
	 private String email;
	 @Column(nullable = false)
	 private Long phone;
	 
	 
	 
	 //Getters and Setters

	 public Attendees() {}
	 public void Attendees(String name, String email, Long phone) {
     this.name = name;
	 this.email = email;
	 this.phone = phone;
	   }
	    
	 public Long getId() {
	 return id;
	  }

	 public void setId(Long id) {
	 this.id = id;
		}

	 public String getName() {
	 return name;
	    }

     public void setName(String name) {
	 this.name = name;
	    }
	 public String getEmail() {
	 return email;
	   }

	 public void setEmail(String email) {
	 this.email = email;
	 
	 }
	 
	 public Long getPhone() {
		 return phone;
		 
	 }
	 
	 public void setPhone(Long phone) {
		 this.phone = phone;
	 }



	

}

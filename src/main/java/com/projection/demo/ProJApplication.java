package com.projection.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.projection.demo.services.EmailService;

@SpringBootApplication
public class ProJApplication {
	
	@Autowired
	EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(ProJApplication.class, args);
	}
	  //@EventListener(ApplicationReadyEvent.class) 
	  //public void trigger() {
	  //emailService.sendEmail("nkollopatrick@yahoo.fr", "salut Pat!...","Email avec Spring boot!"); 
	  //}
	 	 
}

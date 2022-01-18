package com.projection.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailService {

	@Autowired
	JavaMailSender javaMailSender;
	
	public  void sendEmail(String to, String content, String subject) {
	
		System.out.println("sending email");
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom("nkollopatrick@gmail.com");
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(content);
		simpleMailMessage.setReplyTo("nkollopatrick@yahoo.fr");
		javaMailSender.send(simpleMailMessage);
		System.out.println("sendt email!");
	}
	/*
	 * pour resoudre le probleme de la connexion au port 587 le conseil que el Professor m'a donné etait de quitter le VPN de Global Protect
	 * et de me lancer dans wifi pure*/
}

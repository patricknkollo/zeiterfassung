package com.projection.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Billionaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(nullable = false)
	public String name;
	
	@Column(nullable = false)
	public String vorname;
	
	@Column(nullable = false)
	public String country;
	
	@Column(nullable = false)
	public String source;
	
	@Column(nullable = false)
	public double networth;
	
	@Column(nullable = false)
	public int age;
	
	public double change;

	public Billionaire(String name, String vorname, String country, String source, double networth, int age,
			double change) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.country = country;
		this.source = source;
		this.networth = networth;
		this.age = age;
		this.change = change;
	}

	
	
}

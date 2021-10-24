package com.challenge.elevator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Keycard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	private Long id;

	private Integer dni;
	private Integer password;
	
	
	
	public Keycard() {
	
	}

	public Keycard(Long id, Integer dni, Integer password) {
		super();
		this.id = id;
		this.dni = dni;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	
	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}
	
	
	
	
	
}
	
	
package com.challenge.elevator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.challenge.elevator.entities.Keycard;

@Repository
public interface KeycardRepository extends JpaRepository <Keycard, Long>{
	
	@Query("SELECT k FROM Keycard k WHERE k.password LIKE 1111")
	public Keycard keycardByPassword();
}

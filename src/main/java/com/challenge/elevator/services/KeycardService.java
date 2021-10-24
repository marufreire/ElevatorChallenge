package com.challenge.elevator.services;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.challenge.elevator.entities.Elevator;
import com.challenge.elevator.entities.Keycard;
import com.challenge.elevator.repositories.KeycardRepository;

@Service
public class KeycardService {

	@Autowired
	public KeycardRepository keycardRepository;
	
	@Autowired
	ElevatorService es;
	
	

	Scanner read = new Scanner(System.in);
	
	@Transactional
	public Keycard create() {
		int dni = 0, password = 0, passwordConfirm = 0;

		Keycard keycard = new Keycard();
		try {
			System.out.println("You are about to create a new user");
			System.out.println("Please insert your DNI number");
			dni = read.nextInt();

			do {
				try {
				System.out.println("Please choose your password (only numbers)");
				password = read.nextInt();

				System.out.println("Please repeat your password(only numbers)");
				passwordConfirm = read.nextInt();
				
				}catch (NumberFormatException ex) {
					System.out.println("Your password can use only numbers");
				}catch (Exception e) {
					e.getMessage();
				}

			} while (password!=passwordConfirm);

			keycard.setDni(dni);
			keycard.setPassword(password);
			
			keycardRepository.save(keycard);
			
		}catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
			System.out.println("Your keycard number is: " + keycard.getId());

			Elevator e = new Elevator();
//			es.chooseElevator(e);
		
		return keycard;

	}

	@Transactional
	public void validateKeycard(Keycard keycard, Integer targetStory) throws Exception {

		int answer = 0;
		Elevator e = new Elevator();
		try {
			System.out.println("Are you a registered user?");
			System.out.println("1: YES");
			System.out.println("2. NO");
			answer = read.nextInt();
			if (answer == 1) {
				System.out.println("Please insert your keycard number");
				Long answer2 = read.nextLong();
				
				Optional <Keycard> rta = keycardRepository.findById(answer2);
				if (rta.isPresent()) {
					System.out.println("Access granted");

					e.setValidateKeycard(true);
					e.setCurrentPosition(targetStory);


				} else {
					System.out.println("The keycard number is incorrect.");
					e.setValidateKeycard(false);

				}

			} else if (answer == 2) {
				System.out.println("Would you like to register a new user?");
				System.out.println("1: YES");
				System.out.println("2. NO");
				int answer3 = read.nextInt();
				if (answer3 == 1) {
					create();

				} else if (answer == 2) {
					System.out.println("Required access is only available for registered users");
					es.managePosition(e);

				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}

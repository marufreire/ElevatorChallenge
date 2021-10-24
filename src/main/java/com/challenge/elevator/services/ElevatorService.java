package com.challenge.elevator.services;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.elevator.entities.Elevator;
import com.challenge.elevator.entities.Keycard;

@Service
public class ElevatorService {

	@Autowired
	private KeycardService ks;
	
	Scanner read = new Scanner(System.in);

	private void verifyWeight(Elevator e1) {

			do {
				System.out.println("Please insert the total weight (kg)");
				e1.setCurrentWeight(read.nextDouble());
				try {
				if (e1.getCurrentWeight() > e1.getMaxWeight()) {
					e1.setAlarm(true);
					System.out.println("ALARM: ON");
					System.out.println("The maximum weight is excedeed. The elevator will shut off");
				}
				} catch (NumberFormatException ex) {
					System.out.println("Please insert a valid weight value (up to 1000 kg)");
				}
			} while (e1.getCurrentWeight() > e1.getMaxWeight());

	}

	/// METHOD TO MOVE THE ELEVATOR

	public Elevator managePosition(Elevator e1) {

	
		int targetStory=0;

			do {
				System.out.println("Which story would you like to go to? (-1 to 50)");
				try {
				targetStory = read.nextInt();

				if (e1.getMaxWeight() == 1000) {
					verifyWeight(e1);
					if (targetStory == 50 || targetStory == -1) {
						System.out
								.println("The story you are trying to eaccess is only available for registered users");
						Keycard k = new Keycard();
						ks.validateKeycard(k, targetStory);

					} else {
						if (targetStory >= e1.getCurrentPosition()) {
							
							System.out.println("Going up");
							for (int i = e1.getCurrentPosition(); i < targetStory; i++) {
								System.out.println(i + " story");
							}
							e1.setCurrentPosition(targetStory);
						} else if (targetStory < e1.getCurrentPosition()) {
							e1.setCurrentPosition(targetStory);
							System.out.println("Going down");
							for (int i = e1.getCurrentPosition(); i > targetStory; --i) {
								System.out.println(i + " story");
							}
							e1.setCurrentPosition(targetStory);
						} 
					}
				} else if (e1.getMaxWeight() == 3000) {
					verifyWeight(e1);
					if (targetStory >= e1.getCurrentPosition()) {
					
						System.out.println("Going up");
						for (int i = e1.getCurrentPosition(); i < targetStory; i++) {
							System.out.println(i + " story");
						}
						e1.setCurrentPosition(targetStory);
					} else if (targetStory < e1.getCurrentPosition()) {
					
						System.out.println("Going down");
						for (int i = e1.getCurrentPosition(); i > targetStory; --i) {
							System.out.println(i + " story");
						}
						e1.setCurrentPosition(targetStory);
					}
				}
				System.out.println("Current story: " + e1.getCurrentPosition());
			} catch (NumberFormatException ex) {

				System.out.println("Please insert a valid story number (-1 to 50)");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			} while (targetStory > e1.getMaxPosition() || targetStory < e1.getMinPosition());

		

		return e1;

	}

}

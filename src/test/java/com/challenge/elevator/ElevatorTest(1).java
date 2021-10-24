package com.challenge.elevator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.challenge.elevator.entities.Keycard;
import com.challenge.elevator.services.ChooseElevatorService;
import com.challenge.elevator.services.FreightElevatorService;
import com.challenge.elevator.services.KeycardService;
import com.challenge.elevator.services.PublicElevatorService;

class ElevatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		ElevatorTest test = new ElevatorTest();

	}

	/// TEST CHOOSE ELEVATOR
	@Test
	public void chooseElevator() {
		ChooseElevatorService.chooseElevator();
	}

	/// TEST FREIGHT ELEVATOR

	@Test
	public void managePositionFreight() {
		FreightElevatorService.managePosition();
	}

	@Test
	/// TEST PUBLIC ELEVATOR
	public void managePositionPublic() {
		PublicElevatorService ps = new PublicElevatorService();
		ps.managePosition();
	}

	@Test
	/// TEST KEYCARD SYSTEM
	public void keycard(Keycard k, int targetStory) throws Exception {
		KeycardService ks = new KeycardService();
		ks.validateKeycard(k, targetStory);

	}

	@Test
	/// TEST KEYCARD SYSTEM
	public void keycard() {
		KeycardService ks = new KeycardService();
		ks.create();
	}

}

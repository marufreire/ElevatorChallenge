package com.challenge.elevator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.challenge.elevator.entities.Elevator;
import com.challenge.elevator.services.ElevatorService;

class FreightElevatorTest {

	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
	
	}

	/// TEST MANAGE POSITION PUBLIC ELEVATOR SERVICE
	@Test
	public void manageElevatorPosition() {
		ElevatorService es = new ElevatorService();
		Elevator e = new Elevator();
		e.setMaxWeight((double) 3000);
		es.managePosition(e);
	}

}

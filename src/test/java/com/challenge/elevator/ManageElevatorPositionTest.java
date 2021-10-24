package com.challenge.elevator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.challenge.elevator.entities.Elevator;
import com.challenge.elevator.services.ElevatorService;

public class ManageElevatorPositionTest {

	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
	
	}

	/// TEST MANAGE POSITION PUBLIC ELEVATOR SERVICE
	@Test
	public void cmanageElevatorPosition() {
		ElevatorService es = new ElevatorService();
		Elevator e = new Elevator();
		e.setMaxWeight((double) 1000);
		es.managePosition(e);
	}
}

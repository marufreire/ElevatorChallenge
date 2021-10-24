package com.challenge.elevator.threads;

import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.elevator.entities.Elevator;
import com.challenge.elevator.services.ElevatorService;

public class PublicElevatorThread extends Thread{

	@Autowired
	private ElevatorService es;
	
	Elevator e = new Elevator(); 
	
	@Override
	public void run() {


	System.out.println("------------------------------------------------");
	System.out.println("YOU ARE IN THE PUBLIC ELEVATOR");
	e.setMaxWeight((double) 1000);
	es.managePosition(e);
	
	try {
		PublicElevatorThread.sleep(1000);
	} catch (InterruptedException ex) {
		System.out.println("Error occured in PublicElevatorThread");
		ex.printStackTrace();
	}
	}
	

}

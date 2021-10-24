package com.challenge.elevator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.challenge.elevator.entities.Keycard;
import com.challenge.elevator.services.KeycardService;

class KeycardCreateTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
	
	}

	/// TEST CREATE KEYCARD METHOD
	@Test
	public void createKeycard() {
		KeycardService ks = new KeycardService();
		Keycard k = new Keycard();
		k=ks.create();
	}

}

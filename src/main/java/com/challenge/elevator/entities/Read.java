package com.challenge.elevator.entities;

import java.io.InputStream;

public class Read {

	private Read read = new Read(System.in);

	public Read(InputStream in) {

	}

	public Read(Read read) {

		this.read = read;
	}

	public Read getRead() {
		return read;
	}

	public void setRead(Read read) {
		this.read = read;
	}

}

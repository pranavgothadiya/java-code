package com.atm.input;

import java.io.IOException;

public class InputDecorator implements Inputs {

	private Inputs input;
	public InputDecorator(Inputs input) {
		this.input = input;
	}

	public void input() throws IOException {
		System.out.println("ATM Base called");
	}
}

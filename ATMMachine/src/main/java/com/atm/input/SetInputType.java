package com.atm.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SetInputType implements Inputs {

	public SetInputType() throws IOException {
		input();
	}
	
	public void input() throws IOException {
		System.out.println("Enter transaction type:");
		BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));
		String inputLine = reder.readLine();
		
		// Do the validation using ValidationHandler
		
		InputData.get().setType(Integer.parseInt(inputLine.trim()));
	}

}

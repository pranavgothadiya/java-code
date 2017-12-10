package com.atm.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReceiptNeedInput extends InputDecorator{

	private Inputs input;
	public ReceiptNeedInput(Inputs input) throws IOException {
		super(input);
		this.input = input;
		input();
	}
	
	@Override
	public void input() throws IOException {
		
		System.out.println("Receipt needed:");
		
		//Take input from console	
		BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));
		String inputLine = reder.readLine();
		
		// Do the validation using ValidationHandler
		
		InputData.get().setReceipt(Boolean.parseBoolean(inputLine.trim()));
	}

}

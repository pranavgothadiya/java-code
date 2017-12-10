package com.atm.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * This class implements the decorator
 * 
 * @author Pranav_Gothadiya
 *
 */
public class AmountInput extends InputDecorator {

	private Inputs input;
	public AmountInput(Inputs input) throws IOException {
		super(input);
		this.input = input;
		input();
	}
	
	@Override
	public void input() throws IOException {
		System.out.println("InputType: " + InputData.get().getType());
		
		System.out.println("Enter Amount:");
		BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));
		String inputLine = reder.readLine();
		
		// Do the validation using ValidationHandler
		
		InputData.get().setAmount(new BigDecimal(inputLine.trim()));
		
	}

}

package com.atm.user;

import com.atm.input.AmountInput;
import com.atm.input.AuthenticationInput;
import com.atm.input.InputData;
import com.atm.input.InputDecorator;
import com.atm.input.Inputs;
import com.atm.input.ReceiptNeedInput;
import com.atm.input.SetInputType;


/**
 * This program is designed to show how to use different design pattern.
 * 
 * @author Pranav_Gothadiya
 *
 */
public class ATMUser {
	
	public static void main(String[] args) {
	
		try {
			// Check the authentication 
			AuthenticationInput inputs = new AuthenticationInput();
			
			System.out.println("Card No: " + InputData.get().getCardNo());
			System.out.println("PIN No: " + InputData.get().getPin());
			
			if(inputs.isAuthenticated()){
				
				Inputs withdrowalInput = new InputDecorator(new ReceiptNeedInput(new AmountInput(new SetInputType())));
				System.out.println("Input Type: " + InputData.get().getType());
				System.out.println("Amount: " + InputData.get().getAmount());
				System.out.println("Receipt Needed: " + InputData.get().isReceipt());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.atm.validations;

import com.atm.uiconsole.ATMConsole;

public class InputValidator {

	private static InputValidator inputValidator = null;
	
	private InputValidator() {
	}
	
	public static InputValidator get(){
		if(inputValidator == null){
			inputValidator = new InputValidator();
		}
		return inputValidator;
		
	}
	
	public void notifyDisplay(String msg){
		ATMConsole.get().display(msg);
	}

	public boolean cardValidator(String inputLine){
		if(inputLine.trim().length() == 16){
			return true;
		} else {
			notifyDisplay("**Invalid card. Enter valid card again.**");
		}
		
		return false;
	}
	
	public boolean passwordValidator(int count, String inputLine){
		if(count >=3){
			notifyDisplay("You have tried maximum number of PIN varification. Good Bye!");
			return false;
		}
		if(inputLine.trim().length() == 4){
			return true;
		} else {
			notifyDisplay("**Invalid PIN. try again **");
		}
		return false;
	}
	
	public boolean typeValidator(){
		
		return false;
	}
	
	public boolean amountValidator(){
		
		return false;
	}
	
	public boolean receiptInputValidator(){
		
		return false;
	}
}

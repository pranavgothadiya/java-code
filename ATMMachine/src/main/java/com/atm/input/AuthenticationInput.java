package com.atm.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.atm.validations.InputValidator;

public class AuthenticationInput implements Inputs {

	private boolean isAuth = false;
	
	public AuthenticationInput() throws IOException{
		input();
	}
	
	public void input() throws IOException {
		
		System.out.println("Enter card number:");
		BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));
		String inputLine = reder.readLine();
		
		
		while(!inputLine.equals("cancel")){
			if(InputValidator.get().cardValidator(inputLine)){
				InputData.get().setCardNo(inputLine.trim());
				break;
			} else {
				System.out.println("Keep trying. Enter card number:");
				inputLine = reder.readLine();
			}
				
		}
		
		System.out.println("Enter PIN:");
		inputLine = reder.readLine();
		
		int count = 0;
		while(!inputLine.equals("cancel")){
			count++;
			if(InputValidator.get().passwordValidator(count, inputLine)){
				InputData.get().setPin(inputLine.trim());
				break;
			} else {
				if(count == 3){
					break;
				}
				System.out.println("Keep trying. Enter PIN:");
				inputLine = reder.readLine();
			}
		}
		
		setAuth(true);

	}
	
	public boolean isAuthenticated(){
		return this.isAuth;
	}
	
	public void setAuth(boolean flag){
		this.isAuth = flag;
		
	}

}

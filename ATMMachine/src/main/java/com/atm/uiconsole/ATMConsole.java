package com.atm.uiconsole;


public class ATMConsole {
	
	private static ATMConsole atmConsole = null;
	
	private ATMConsole() {
	}
	
	/*
	 * Use: Singleton
	 */
	public static ATMConsole get(){
		if(atmConsole == null){
			atmConsole = new ATMConsole();
		}
		return atmConsole;
	}
	
	public void display(String msg){
		System.out.println("ATM DISPLAY: " + msg);
	}
	

	
}

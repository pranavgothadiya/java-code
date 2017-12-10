package com.pranav.design.command;

public class TestClient {

	public static void main(String[] args) {
		
		// Create an istance 
		Electronics electronics = new Television();
		Command muteCommand = new MuteCommand(electronics);
		
		Button muteButton = new Button(muteCommand);
		muteButton.click();
	}
}

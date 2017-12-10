package com.pranav.design.command;

public class MuteCommand implements Command{

	// Have 
	Electronics electronics;
	
	public MuteCommand(Electronics ec) {
		this.electronics = ec;
	}

	public void execute() {
		electronics.mute();
	}

}

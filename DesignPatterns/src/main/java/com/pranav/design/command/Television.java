package com.pranav.design.command;

public class Television implements Electronics{

	public void on() {
		System.out.println("Television ON");
	}

	public void mute() {
		System.out.println("Television MUTE");
	}

}

package com.pranav.design.bridge;

public class Bike extends Vehicle{

	public Bike(Workshop inst1, Workshop inst2) {
		super(inst1, inst2);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike ");
		wsProduction.work();
		wsAssembly.work();
	}

}

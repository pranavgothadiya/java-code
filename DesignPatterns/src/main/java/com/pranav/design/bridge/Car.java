package com.pranav.design.bridge;

/**
 * 
 * @author Pranav_Gothadiya
 *
 */
public class Car extends Vehicle {

	public Car(Workshop inst1, Workshop inst2) {
		super(inst1, inst2);
	}

	@Override
	public void manufacture() {
		System.out.print("Car ");
		wsProduction.work();
		wsAssembly.work();
	}

}

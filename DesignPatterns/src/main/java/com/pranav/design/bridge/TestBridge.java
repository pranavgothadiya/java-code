package com.pranav.design.bridge;

/**
 * 
 * @author Pranav_Gothadiya
 *
 */
public class TestBridge {
	public static void main(String[] args) {
		// Bridge call - Bridge between Production and Assembly phase in vehicle manufacturing
		Vehicle car = new Car(new Production(), new Assembly());
		car.manufacture();
		
		// Bridge call
		Vehicle bike = new Bike(new Production(), new Assembly());
		bike.manufacture();
	}
}

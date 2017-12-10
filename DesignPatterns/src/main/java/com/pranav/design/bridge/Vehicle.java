package com.pranav.design.bridge;

/**
 * 
 * @author Pranav_Gothadiya
 *
 */
public abstract class Vehicle {

	Workshop wsProduction;
	Workshop wsAssembly;
	
	public Vehicle(Workshop inst1, Workshop inst2){
		wsProduction = inst1;
		wsAssembly = inst2;
	}
	
	public abstract void manufacture();
}

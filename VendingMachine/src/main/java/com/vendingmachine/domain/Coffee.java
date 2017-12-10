/**
 * 
 */
package com.vendingmachine.domain;

import com.vendingmachine.exception.NotAvailableException;

/**
 * 
 * @author Pranav_Gothadiya
 *
 */
public class Coffee extends Drink{

	int milk = 50; //in milliliter 
	
	int sugar = 1; // 1 Spoon
	
	int coffeePoweder = 1; // 1 Spoon
	
	public Coffee(String name) {
		super();
		this.name = name;
	}
	
	public void addMilk(int milk) throws NotAvailableException{
		
		this.milk = RawMaterialFactory.getInstance().getMilk(milk);
	}
	
	public void addSugar(int sugar) throws NotAvailableException{
		
		this.sugar = RawMaterialFactory.getInstance().getSugar(sugar);
	}
	
	public void addCoffeePowder(int coffeePoweder) throws NotAvailableException{
		
		this.coffeePoweder = RawMaterialFactory.getInstance().getTeaPowder(coffeePoweder);
	}

	@Override
	public String serveDrink() {
		return "*****Here is your Coffee*****";
	}
}

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
public class Tea  extends Drink{

	
	int milk = 50; //in milliliter 
	
	int sugar = 1; // 1 Spoon
	
	int teaPoweder = 1; // 1 Spoon
	
	public Tea(String name) {
		super();
		this.name = name;
	}
	
	public void addMilk(int milk) throws NotAvailableException{
		
		this.milk = RawMaterialFactory.getInstance().getMilk(milk);
	}
	
	public void addSugar(int sugar) throws NotAvailableException{
		
		this.sugar = RawMaterialFactory.getInstance().getSugar(sugar);
	}
	
	public void addTeaPowder(int teaPoweder) throws NotAvailableException{
		
		this.teaPoweder = RawMaterialFactory.getInstance().getTeaPowder(teaPoweder);
	}

	@Override
	public String serveDrink() {
		// TODO Auto-generated method stub
		return "*****Here is your Tea*****";
	}
	
}

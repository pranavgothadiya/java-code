package com.vendingmachine.domain;

import com.vendingmachine.exception.NotAvailableException;

/**
 * 
 * @author Pranav_Gothadiya
 *
 */
public class DrinkFactory {
	
	public Drink makeTea(){
		
		Tea tea = new Tea("Tea");
		try {
		tea.addMilk(50);
		tea.addSugar(1);
		tea.addTeaPowder(1);		
		} catch (NotAvailableException nae) {
			System.out.println(nae.getMessage());
		}
		return tea;
	}
	
	public Drink makeCoffee(){
		
		Coffee coffee = new Coffee("Coffee");
		try {
			coffee.addMilk(50);
			coffee.addSugar(1);
			coffee.addCoffeePowder(1);
		}catch(NotAvailableException nae){
			System.out.println(nae.getMessage());
		}
		return coffee;
		
	}

}

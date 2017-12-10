package com.vendingmachine.domain;

import com.vendingmachine.exception.NotAvailableException;

/**
 * 
 * @author Pranav_Gothadiya
 *
 */
public class RawMaterialFactory {
	
	int milkQty = 0; //Milliliter
	
	int sugarQty = 0; //Spoons
	
	int teaPowderQty = 0; //Spoons
	
	int coffeePowderQty = 0; //Spoons
	
	private static RawMaterialFactory rawMaterialFactory = new RawMaterialFactory(1000, 200,200,200 );
	
	private RawMaterialFactory(int milkQty, int sugarQty, int teaPowderQty, int coffeePowderQty) {
		super();
		this.milkQty = 1000;
		this.sugarQty = 200;
		this.teaPowderQty = 200;
		this.coffeePowderQty = 200;
	}
	
	public static RawMaterialFactory getInstance( ) {
	      return rawMaterialFactory;
	   }



	public void addStock(String type, int quantity) {

		switch (type) {

		case "milk":
			milkQty = 1000;
			break;

		case "sugar":
			sugarQty = 200;
			break;

		case "teaPowder":
			teaPowderQty = 200;
			break;
			
		case "coffeePowder":
			coffeePowderQty = 200;
			break;

		}	
		
	}
	
	public void addStocks(int milkQty, int sugarQty, int teaPowderQty, int coffeePowderQty ){
		this.milkQty = milkQty;
		this.sugarQty = sugarQty;
		this.teaPowderQty = teaPowderQty;
		this.coffeePowderQty = coffeePowderQty;
	}
	
	
	 public int getMilk(int quantity) throws NotAvailableException{
			if(milkQty < quantity) throw new NotAvailableException("Milk is not available");
			milkQty = milkQty - quantity;
			return quantity;
		}
	 
	 public int getSugar(int quantity) throws NotAvailableException{
			if(sugarQty < quantity) throw new NotAvailableException("Sugar is not available");
			sugarQty = sugarQty - quantity;
			return quantity;
		}
	 
	 public int getTeaPowder(int quantity) throws NotAvailableException{
			if(teaPowderQty < quantity) throw new NotAvailableException("Tea powder is not available");
			teaPowderQty = teaPowderQty - quantity;
			return quantity;
		}
	 
	 public int getCoffeePowder(int quantity) throws NotAvailableException{
			if(coffeePowderQty < quantity) throw new NotAvailableException("Coffee powder is not available");
			coffeePowderQty = coffeePowderQty - quantity;
			return quantity;
		}
	 
	 

}

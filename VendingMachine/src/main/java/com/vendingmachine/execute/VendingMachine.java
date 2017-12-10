package com.vendingmachine.execute;

import java.util.Scanner;

import com.vendingmachine.domain.Drink;
import com.vendingmachine.domain.DrinkFactory;
import com.vendingmachine.domain.RawMaterialFactory;


/**
 * 
 * @author Pranav_Gothadiya
 *
 */
public class VendingMachine {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int menuOption = 0;
		DrinkFactory drinkFactory = new DrinkFactory();
		
		do {
			menuOption = showMenu();
			switch (menuOption) {

            case 1:
            	Drink tea = drinkFactory.makeTea();
            	System.out.println((tea.serveDrink()));
                break;
            case 2:
            	Drink coffee = drinkFactory.makeCoffee();
            	System.out.println((coffee.serveDrink()));
                break;
            case 3:
            	RawMaterialFactory.getInstance().addStocks(3,3,3,3);
            	System.out.println("*****Raw Material is fillied*****");
                break;
            case 4:
                System.out.println("Quitting Program...");
                break;
            default:
                System.out.println("Sorry, please enter valid Option");

            }
			
		} while(menuOption != 4);

	}
	
	public static int showMenu() {

        // Declaring var for user option and defaulting to 0
        int option = 0;

        // Printing menu to screen
        System.out.println("Menu:");
        System.out.println("1.Tea");
        System.out.println("2.Coffee");
        System.out.println("3.Refill");
        System.out.println("4. Quit Program");

        // Getting user option from above menu
        System.out.println("Enter Option from above...");
        option = scanner.nextInt();
        return option;
    }

}

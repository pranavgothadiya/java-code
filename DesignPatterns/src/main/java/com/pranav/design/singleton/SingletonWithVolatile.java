package com.pranav.design.singleton;

public class SingletonWithVolatile {

	private static volatile SingletonWithVolatile INSTANCE = null;
	
	private SingletonWithVolatile() {
		//Do the initialization requred in this class
	}
	public static SingletonWithVolatile getInstance(){
		if(INSTANCE == null){
			synchronized (SingletonWithVolatile.class) {
				if(INSTANCE == null){
					INSTANCE = new SingletonWithVolatile();
					System.out.println("Created");
				}
			}
		}
		return INSTANCE;
	}
	
	public void display(){
		System.out.println("Display message");
	}
	
	public static void main(String[] args) {
		SingletonWithVolatile.getInstance().display();
		SingletonWithVolatile.getInstance().display();
		SingletonWithVolatile.getInstance().display();
	}
}

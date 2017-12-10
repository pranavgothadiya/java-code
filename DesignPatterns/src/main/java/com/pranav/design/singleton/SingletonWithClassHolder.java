package com.pranav.design.singleton;

public class SingletonWithClassHolder {

	private static class Holder {
		public static SingletonWithClassHolder INSTANCE = new SingletonWithClassHolder();
	}
	
	private SingletonWithClassHolder(){
		//Do required initialization here
	}
	
	public static SingletonWithClassHolder getInstance(){
		return Holder.INSTANCE;
	}
	
	public void display(){
		System.out.println("Display message.");
	}
	public static void main(String[] args) {
		SingletonWithClassHolder.getInstance().display();
		SingletonWithClassHolder.getInstance().display();
		SingletonWithClassHolder.getInstance().display();
	}

}

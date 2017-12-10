package com.pranav.design.iterator;


public class Client {
	public static void main(String[] args) {
		IZoo zoo = new BangaloreZoo();
		zoo.addAminal(new Animal("Dog", "Domestic"));
		zoo.addAminal(new Animal("Tiger", "Wild"));
		zoo.addAminal(new Animal("Lion", "Wild"));
		zoo.addAminal(new Animal("Cow", "Domestic"));
		zoo.addAminal(new Animal("Horse", "Domestic"));
		zoo.addAminal(new Animal("Sheep", "Domestic"));

		IIterator iterator = zoo.createIterator();

		while (!iterator.isLastAnimal()) {
			Animal a = iterator.next();
			System.out.println(a.getName() + " : " + a.getType());
		}

		iterator.reset();
		
		while (!iterator.isLastAnimal()) {
			Animal a = iterator.next();
			System.out.println(a.getName() + " : " + a.getType());
		}
	}
}

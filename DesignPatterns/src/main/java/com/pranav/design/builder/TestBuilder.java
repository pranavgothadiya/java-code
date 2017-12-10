package com.pranav.design.builder;

/**
 * In object-oriented programming, the decorator pattern is a design pattern
 * that allows new/additional Behavior to be added to an existing object
 * dynamically.
 * 
 * There's no need to add topings to a Pizza after it has been fully
 * constructed. You don't eat half a Pizza and then add another toping to it.
 * 
 * In other words, the Builder Pattern makes it easy to construct an object at
 * construction time, while the Decorator Pattern lets you add extensions to
 * functionality to an object after construction time.
 * 
 * Using the decorator pattern to construct objects is bad because it leaves the
 * object in an inconsistent (or at least incorrect) state until all the
 * required decorators are in place - similar to the JavaBean problem of using
 * setters to specify optional constructor arguments.
 */
public class TestBuilder {
	
	public static void main(String[] args) {
		Cake cake = new Builder().suger("1 cup").butter("2 cubs").agg("2").cherry("5").build();
		System.out.println(cake.toString());
		
		cake = new Builder().suger("2 cup").butter("4 cubs").build();
		System.out.println(cake.toString());

		
		cake = new Builder().suger("5 cup").butter("10 cubs").agg("8").build();
		System.out.println(cake.toString());

	}

}

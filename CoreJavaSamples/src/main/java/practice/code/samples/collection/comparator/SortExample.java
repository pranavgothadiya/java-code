package practice.code.samples.collection.comparator;

/**
 * @author Pranav_Gothadiya
 * 
 * 
 * 	Collections can sort the list of Dog only and only if it is Comparable
 *	Which means, Dog class should have implemented Comparable interface.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparator<Dog>, Comparable<Dog> {
	private String name;
	private int age;

	Dog() {
	}

	Dog(String n, int a) {
		name = n;
		age = a;
	}

	public String getDogName() {
		return name;
	}

	public int getDogAge() {
		return age;
	}

	// Overriding the compareTo method of Comparable to compare Dog objects by name
	public int compareTo(Dog d) {
		return (this.name).compareTo(d.name);
	}

	// Overriding the compare method of Comparator to sort the age of two Dog Objects
	public int compare(Dog d, Dog d1) {
		return d.age - d1.age;
	}
}

public class SortExample {

	public static void main(String args[]) {
		// Takes a list o Dog objects
		List<Dog> list = new ArrayList<Dog>();

		list.add(new Dog("Shaggy", 3));
		list.add(new Dog("Lacy", 2));
		list.add(new Dog("Roger", 10));
		list.add(new Dog("Tommy", 4));
		list.add(new Dog("Tammy", 1));
		
		//Collections can sort the list of Dog only and only if it is Comparable
		//Which means, Dog class should have implemented comparable interface.
		Collections.sort(list);// Sorts the array list

		for (Dog a : list)
			// printing the sorted list of names
			System.out.print(a.getDogName() + ", ");

		// Sorts the array list using comparator
		Collections.sort(list, new Dog());
		System.out.println(" ");
		for (Dog a : list)
			// printing the sorted list of ages
			System.out.print(a.getDogName() + "  : " + a.getDogAge() + ", ");
	}
}
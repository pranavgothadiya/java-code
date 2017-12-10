package com.pranav.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class BangaloreZoo implements IZoo {

	private List<Animal> list;

	public BangaloreZoo() {
		list = new ArrayList<Animal>();
	}

	public void addAminal(Animal animal) {
		list.add(animal);
	}

	public void removeAnimal(Animal animal) {
		list.remove(animal);
	}

	public List<Animal> getAnimals() {
		return list;
	}

	public IIterator createIterator() {
		return new AnimalIterator(list);
	}

}

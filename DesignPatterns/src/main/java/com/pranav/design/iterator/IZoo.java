package com.pranav.design.iterator;

import java.util.List;

public interface IZoo {

	public void addAminal(Animal animal);
	public void removeAnimal(Animal animal);
	public List<Animal> getAnimals();
	public IIterator createIterator();
}

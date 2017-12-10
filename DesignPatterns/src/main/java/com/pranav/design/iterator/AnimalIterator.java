package com.pranav.design.iterator;

import java.util.List;

public class AnimalIterator implements IIterator {

	private List<Animal> list;
	private int cnt = 0;

	public AnimalIterator(List<Animal> list) {
		this.list = list;
	}

	public Animal next() {
		return list.get(cnt++);
	}

	public boolean isLastAnimal() {
		return cnt >= list.size();
	}

	public void reset() {
		cnt = 0;
	}
}

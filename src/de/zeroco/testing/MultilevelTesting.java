package de.zeroco.testing;

import de.zeroco.util.Dog;

public class MultilevelTesting {
	public static void main(String[] args) {

		Dog dog = new Dog(true, "Chicken", 4, "white", "Jimmy");
		System.out.println(dog.isVegetarian());
		System.out.println(dog.getNoOfLegs());
		System.out.println(dog.getColor());
		System.out.println(dog.getEats());
		System.out.println(dog.getDogName());
	}

}

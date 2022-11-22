package de.zeroco.testing;

import de.zeroco.util.Cat;

public class SingleLevelTesting {
	public static void main(String[] args) {
		Cat cat = new Cat(true, "milk", 4, "grey");
		System.out.println(cat.isVegetarian());
		System.out.println(cat.getNoOfLegs());
		System.out.println(cat.getColor());
		System.out.println(cat.getEats());
		
	}
	

}

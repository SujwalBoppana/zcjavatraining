package de.zeroco.util;

public class Dog extends Cat {
	public String dogName;

	public Dog(boolean veg, String food, int legs, String color, String dogName) {
		super(veg, food, legs, color);
		this.dogName = dogName;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	

}

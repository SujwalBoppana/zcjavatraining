package de.zeroco.util;

public class Cat extends Animal {
	

	public String color;

	public Cat(boolean veg, String food, int legs, String color) {
		super(veg, food, legs);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

package zc.training.practice;

class Animal {
	public String name;
	public double weight;

	public Animal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}
}

public class Dog extends Animal {
	public int legs;
	public String colour;

	public Dog(String name, double weight, int legs, String colour) {
		// calls the super class (Animal) constructor
		super(name, weight);
		this.legs = legs;
		this.colour = colour;
	}

	public int getLegs() {
		return legs;
	}

	public String getColour() {
		return colour;
	}
}

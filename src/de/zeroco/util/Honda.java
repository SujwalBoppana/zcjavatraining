package de.zeroco.util;

abstract class Bike {
	int cost;
	int milage;

	public Bike(int cost, int milage) {
		this.cost = cost;
		this.milage = milage;
	}

	public abstract void setModel(int modelNo);

	public abstract void setColor(String colour);

	public int setPrice(int cost) {
		return cost;
	}

	public int setMilage(int milage) {
		return milage;

	}
}

public class Honda extends Bike {
	public Honda(int cost, int milage) {
		super(cost, milage);
	}

	String colour;
	int modelNo;

	@Override
	public void setColor(String colour) {
		this.colour = colour;
	}
	@Override
	public void setModel(int modelNo) {
		this.modelNo = modelNo;
	}


	public String getColour() {
		return colour;
	}

	public int getModelNo() {
		return modelNo;
	}

	}

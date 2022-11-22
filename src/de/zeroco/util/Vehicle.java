package de.zeroco.util;

public class Vehicle {
	String carBrand;
	int noOfGears;
	String colour;
	String fuelType;
	int milage;

	public Vehicle(String carBrand, int noOfGears) {
		this.carBrand = carBrand;
		this.noOfGears = noOfGears;
	}

	public Vehicle(String carBrand, int noOfGears, String colour, String fuelType) {
		this(carBrand, noOfGears);
		this.colour = colour;
		this.fuelType = fuelType;
	}

	public Vehicle(String carBrand, int noOfGears, String colour, String fuelType, int milage) {
		this(carBrand, noOfGears, colour, fuelType);
		this.fuelType = fuelType;
		this.milage = milage;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public String getColour() {
		return colour;
	}

	public String getFuelType() {
		return fuelType;
	}

	public int getMilage() {
		return milage;
	}

}

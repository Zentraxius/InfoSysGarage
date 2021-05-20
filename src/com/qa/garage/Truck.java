package com.qa.garage;

public class Truck extends Vehicle {
	public Truck(String manufacturer, int numWheels, int mpg, String fuelType, boolean isImport) {
		super(manufacturer, numWheels, mpg, fuelType, isImport);
		// TODO Auto-generated constructor stub
	}

	private int carryWeight = 0;
	private int numWheels = 4;

	public void startVehicle() {
		if (this.numWheels < 4) {
			System.out.println("Not enough wheels! It will crash!");
		} else
			System.out.println(
					"The engine roars to life, you feel the confidence "
					+ "only obtainable by sitting high off the ground ");
	}

	public int checkWheels() {
		return this.numWheels;
	}

	public void modWheel(int input) {
		this.numWheels += input;
	}

	public int checkCarryWeight() {
		return this.carryWeight;
	}

	public void modCarryWeight(int input) {
		this.carryWeight += input;
	}
}

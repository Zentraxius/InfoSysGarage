package com.qa.garage;

public class Car extends Vehicle {
	public Car(String manufacturer, int numWheels, int mpg, String fuelType, boolean isImport) {
		super(manufacturer, numWheels, mpg, fuelType, isImport);
		// TODO Auto-generated constructor stub
	}

	private int milesPerG = 10;

	public void startVehicle() {
		if (milesPerG < 1) {
			System.out.println("Miles per G too low, car won't start!");
		} else
			System.out.println("The engine of the car humms to life");
	}

	public void improveMiles(int input) {
		this.milesPerG += input;
	}

	public int getMiles() {
		return this.milesPerG;
	}
}

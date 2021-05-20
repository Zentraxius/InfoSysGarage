package com.qa.garage;

public class Motorcycle extends Vehicle {
	public Motorcycle(String manufacturer, int numWheels, int mpg, String fuelType, boolean isImport) {
		super(manufacturer, numWheels, mpg, fuelType, isImport);
		// TODO Auto-generated constructor stub
	}

	private int numWheels = 2;
	private String riskFactor = "High";
	
	public void startVehicle() {
		System.out.println("You revv your motorcycle, you scared away the birds. You have " + this.numWheels + " wheels and your risk factor is: " + this.riskFactor);
	}
}

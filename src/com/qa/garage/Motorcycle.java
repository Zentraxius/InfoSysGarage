package com.qa.garage;

public class Motorcycle {
	private int numWheels = 2;
	private String riskFactor = "High";
	
	public void startVehicle() {
		System.out.println("You revv your motorcycle, you scared away the birds. You have " + this.numWheels + " wheels and your risk factor is: " + this.riskFactor);
	}
}

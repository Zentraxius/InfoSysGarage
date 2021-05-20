package com.qa.garage;

public class Vehicle {
	public String manufacturer;
	public int numWheels;
	public int mpg;
	public String fuelType;
	public boolean isImport;
	
	public Vehicle(String manufacturer, int numWheels, int mpg, String fuelType, boolean isImport) {
		super();
		this.manufacturer = manufacturer;
		this.numWheels = numWheels;
		this.mpg = mpg;
		this.fuelType = fuelType;
		this.isImport = isImport;
	}
}

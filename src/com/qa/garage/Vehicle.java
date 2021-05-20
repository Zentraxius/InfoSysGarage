package com.qa.garage;

public class Vehicle extends Garage {
	private boolean forSale = false;
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
	
	public void listSale() {
		this.forSale = true;
	}
	public boolean isForSale() {
		return this.forSale;
	}
	public void startVehicle() {
		System.out.println("You turn on the ignition, the engine humms to life.");
	}

	@Override
	public String toString() {
		return "Vehicle [forSale=" + forSale + ", manufacturer=" + manufacturer + ", numWheels=" + numWheels + ", mpg="
				+ mpg + ", fuelType=" + fuelType + ", isImport=" + isImport + "]";
	}
	
}

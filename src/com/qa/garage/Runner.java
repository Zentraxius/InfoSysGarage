package com.qa.garage;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		Vehicle vehicleOne = new Vehicle("Vehicle", 4, 10, "Unleaded", false);
		Motorcycle motoOne = new Motorcycle("Motorcycle", 2, 32, "Unleaded-Premium", false);
		Truck truckOne = new Truck("Truck", 8, 12, "Diesel", true);
		Car carOne = new Car("Car", 4, 20, "Unleaded", true);
//		vehiC.startVehicle();
//		System.out.println(vehiC.isForSale());
//		vehiC.listSale();
//		System.out.println(vehiC.isForSale());

//		Motorcycle motoC = new Motorcycle();
//		motoC.startVehicle();
//		System.out.println(motoC.isForSale());
//
//		Truck truC = new Truck();
//		truC.startVehicle();
//		System.out.println(truC.checkWheels());
//		truC.modWheel(-2);
//		System.out.println(truC.checkWheels());
//		truC.startVehicle();
//
//		Car car = new Car();
//		car.startVehicle();
//		System.out.println(car.getMiles());
//		car.improveMiles(-11);
//		System.out.println(car.getMiles());
//		car.startVehicle();

		ArrayList<Garage> garageName = new ArrayList<>();
		garageName.add(vehicleOne);
		garageName.add(motoOne);
		garageName.add(truckOne);
		garageName.add(carOne);
		System.out.println(garageName);

	}
}

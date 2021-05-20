package com.qa.main.garage.vehicle.type;

import com.qa.main.garage.vehicle.Vehicle;

// is-a relationship

public class Motorcycle extends Vehicle {

	// ************//
	// CONSTRUCTOR //
	// ************//
	public Motorcycle(String vehicleType, String classType, boolean isParked, boolean isDriving, int tireCount,
			int doorCount) {
		super(vehicleType, classType, isParked, isDriving, tireCount, doorCount); // object class

	}

	@Override
	public void driving() {
		System.out.print("Motorcyle has lef the garage!");
	}

}

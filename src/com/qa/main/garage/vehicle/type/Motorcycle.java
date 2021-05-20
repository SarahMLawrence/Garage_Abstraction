package com.qa.main.garage.vehicle.type;

import com.qa.main.garage.vehicle.Vehicle;

// is-a relationship

public class Motorcycle extends Vehicle {

	// ************//
	// CONSTRUCTOR //
	// ************//
	public Motorcycle(String vehicleType, String classType, int tireCount, int doorCount) {
		super(vehicleType, classType, tireCount, doorCount); // object class

	}

}

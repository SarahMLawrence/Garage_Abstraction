package com.qa.main.garage.vehicle;

public abstract class Vehicle {

	// ***********//
	// ATTRIBUTES //
	// ***********//
	private String vehicleType;
	private String classType;

	// ************//
	// CONSTRUCTOR //
	// ************//
	public Vehicle(String vehicleType, String classType, int seatCount, int tireCount) {
		this.vehicleType = vehicleType;
		this.classType = classType;

	}

	// ********//
	// METHODS //
	// ********//

	// Read only - these wont change
	public String getVehicleType() {
		return vehicleType;
	}

	public String getClassType() {
		return vehicleType;
	}

}

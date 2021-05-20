package com.qa.main.garage.vehicle;

import com.qa.main.garage.Garage;

public class Vehicle extends Garage {

	// ***********//
	// ATTRIBUTES //
	// ***********//
	private String vehicleType;
	private String classType;
	private boolean isParked;
	private boolean isDriving;
	private int tireCount;
	private int doorCount;

	// ************//
	// CONSTRUCTOR //
	// ************//
	public Vehicle() {
		super();
		this.vehicleType = "??? - generic";
		this.classType = "??? - generic";
		this.isParked = true;
		this.isDriving = false;
		this.tireCount = 2;
		this.doorCount = 0;

	}

	public Vehicle(String vehicleType, String classType, boolean isParked, boolean isDriving, int tireCount,
			int doorCount) {
		this.vehicleType = vehicleType;
		this.classType = classType;
		this.isParked = isParked;
		this.isDriving = isDriving;
		this.tireCount = tireCount;
		this.doorCount = doorCount;
	}

	// ********//
	// METHODS //
	// ********//

	public void driving() {
		this.isDriving = true;
	}

	// Read only - these wont change
	public String getVehicleType() {
		return vehicleType;
	}

	public String getClassType() {
		return vehicleType;
	}

}

package com.qa.main;

import com.qa.main.garage.Garage;
import com.qa.main.garage.vehicle.Vehicle;
import com.qa.main.garage.vehicle.type.Motorcycle;

public class Runner {

	// attribute

	// Main method - starting
	public static void main(String[] args) {

		Garage myGarage = new Garage("Sarah's Garage", 3);
		System.out.println(" Welcome to " + myGarage.getGarageName());

		Vehicle x = new Motorcycle("Motorcyle", "M", 2, 0);
		System.out.println("Motorcycle is parked in " + myGarage.getGarageName());
		x.parked();

	}

	// Methods
	// accessor, static/non, return type, nameof, parameterlist, scope

// class
// attributes(class members)
// methods (class members)
}

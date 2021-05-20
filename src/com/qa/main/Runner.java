package com.qa.main;

import com.qa.main.garage.Garage;

public class Runner {

	// attribute

	// Main method - starting
	public static void main(String[] args) {

		Garage myGarage = new Garage("Sarah's Garage", 3);
		System.out.println(" Welcome to " + myGarage.getGarageName());
		System.out.println(myGarage.getGarageName() + " has " + myGarage.getDoorCount());

	}

	// Methods
	// accessor, static/non, return type, nameof, parameterlist, scope

// class
// attributes(class members)
// methods (class members)
}

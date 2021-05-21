package com.qa.main.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.main.garage.vehicle.Vehicle;

public class Garage {

	// ***********//
	// ATTRIBUTES //
	// ***********//
	private String garageName;

	// ************//
	// CONSTRUCTOR //
	// ************//
	public Garage() {
		super();
		this.garageName = "Sarah's Garage";

	}

	public Garage(String garageName) {
		this.garageName = garageName;

	}

	// ********//
	// METHODS //
	// ********//

	// Create new list to store vehicles in
	List<Vehicle> sarahsGarage = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicle) {
		// add vehicle by id ??
		sarahsGarage.add(vehicle);

	}

	public void deleteVehicle(Vehicle vehicle) {

		for (int i = 0; i < sarahsGarage.size(); i++) {
			System.out.println("\nVehicle " + i + " has left" + this.garageName + sarahsGarage.remove(i));
		}

	}

	public void whosAtSarahsGarage() {

		System.out.print("\n\nWelcome! Here is the list of vehicles currently at " + this.garageName + "\n\n");

		for (int i = 0; i < sarahsGarage.size(); i++) {
			System.out.println(sarahsGarage.get(i));
		}

	}

	public String getGarageName() {
		return garageName;
	}

}

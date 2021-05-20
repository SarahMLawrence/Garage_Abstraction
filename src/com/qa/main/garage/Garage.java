package com.qa.main.garage;

public abstract class Garage {

	// ***********//
	// ATTRIBUTES //
	// ***********//
	private String garageName;
	private int doorCount;

	// ************//
	// CONSTRUCTOR //
	// ************//
	public Garage() {
		super();
		this.garageName = "Sarah's Garage";
		this.doorCount = 3;

	}

	public Garage(String garageName, int doorCount) {
		this.garageName = garageName;
		this.doorCount = doorCount;
	}

	// ********//
	// METHODS //
	// ********//

	public String getGarageName() {
		return garageName;
	}

	public int getDoorCount() {
		return doorCount;

	}

}

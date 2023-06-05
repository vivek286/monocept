package com.monocept.inheritanceassesment;

public class FourWheeler extends Vehicle {
	protected double mileage;

    public FourWheeler(String companyName, double mileage) {
        super(companyName);
        this.mileage = mileage;
    }

    public double getMileage() {
		return mileage;
	}


	@Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mileage: " + mileage + " km/L");
    }
}

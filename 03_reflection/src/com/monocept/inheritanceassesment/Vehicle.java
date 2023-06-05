package com.monocept.inheritanceassesment;

public class Vehicle {
	protected String companyName;

    public Vehicle(String companyName) {
        this.companyName = companyName;
    }

    public void displayInfo() {
        System.out.println("Company: " + companyName);
    }
}

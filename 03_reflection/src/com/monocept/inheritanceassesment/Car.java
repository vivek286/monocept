package com.monocept.inheritanceassesment;

public class Car extends FourWheeler {
	private double price;

    public Car(String companyName, double mileage, double price) {
        super(companyName, mileage);
        this.price = price;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Price: $" + price);
    }
    public String toString() {
    	return "Company name: "+this.companyName+"\n"+"Milage: "+this.mileage+"\n"+"Price :"+this.price;
    }
}

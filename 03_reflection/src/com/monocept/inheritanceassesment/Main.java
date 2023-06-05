package com.monocept.inheritanceassesment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of cars");
		int NumberOfCars=scanner.nextInt();
		Car DataOfCars[]=new Car[NumberOfCars];
		for(int i=0;i<NumberOfCars;i++) {
			String company_name="";
			double milage,price;
			System.out.println("Enter Company name of car");
			company_name=scanner.next();
			System.out.println("Enter milage of car");
			milage=scanner.nextDouble();
			System.out.println("Enter price of car");
			price=scanner.nextDouble();
			DataOfCars[i]=new Car(company_name,milage,price);
			
			
		}
		for(Car car:DataOfCars) {
			System.out.println(car);
		}

	}

}

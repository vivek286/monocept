package com.monocept.assesment;

import java.util.Scanner;

public class ridebillcalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lets start ride!!! \n what is your height?");
		int height=scanner.nextInt();
		int total_cost=0;
		if(height>120) {
			System.out.println("Greate you are eligible to ride \n what's your age?");
			int age=scanner.nextInt();
			if(age<12) {
				total_cost+=5;
			}else if(age<18) {
				total_cost+=7;
			}else {
				total_cost+=12;
			}
			if(age>=45&&age<=55)total_cost=0;
			System.out.println("Do you want Photos?");
			String response=scanner.next();
			if(response.equals("Yes"))total_cost+=3;
			
			System.out.println("Total ride Bill is : "+total_cost);
			
		}else {
			System.out.println("Sorry you cant ride");
		}

	}

}

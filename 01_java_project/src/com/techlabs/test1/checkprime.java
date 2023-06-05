package com.techlabs.test1;

import java.util.Scanner;

public class checkprime {
	public static void main(String[] args)  {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=scanner.nextInt();
		int count=0;
		for(int i=2;i<number;i++) {
			if(number%i==0)count++;
		}
		if(count!=0) {
			System.out.println("Number is not prime");
		}else {
			System.out.println("Number is prime");
		}
		
		
		
	}
}

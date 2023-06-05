package com.monocept.enums;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter numbers of patieent : ");
	int number =scanner.nextInt();
	patient array[]=new patient[number];
	for(int i=0;i<number;i++) {
		System.out.println("Enter name of patient "+(i+1)+": ");
		
		String name=scanner.next();
		System.out.println("Enter BP level (low/normal/high)");
		String bp=scanner.next();
		array[i]=new patient(BpLevel.valueOf(bp),name);
	}
	
	for(patient temp:array)	
	System.out.println(temp);
	
}
}

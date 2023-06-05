package com.techlabs.test1;

import java.util.Scanner;

public class maximumelement {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements");
		
		int n=scanner.nextInt();
		int array[]=new int[n];
		System.out.println("Enter n elements");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		int maximum_element=array[0];
		for(int i=0;i<n;i++) {
			if(array[i]>maximum_element)maximum_element=array[i];
		}
		System.out.println("Maximum element in array is "+maximum_element);
		
	}
}

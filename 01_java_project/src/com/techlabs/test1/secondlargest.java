package com.techlabs.test1;

import java.util.Arrays;
import java.util.Scanner;

public class secondlargest {

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
			int second_largest=array[0];
			for(Integer element:array) {
				if(element>second_largest&&element!=maximum_element)second_largest=element;

			}
			System.out.println("Second largest element is :"+second_largest);
			
		}
}

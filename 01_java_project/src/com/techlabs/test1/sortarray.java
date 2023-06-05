package com.techlabs.test1;

import java.util.Arrays;
import java.util.Scanner;

public class sortarray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements");
		
		int n=scanner.nextInt();
		int array[]=new int[n];
		System.out.println("Enter n elements");
			for(int i=0;i<n;i++) {
				array[i]=scanner.nextInt();
			}
			Arrays.sort(array);
			System.out.println("sorted array is : ");
			for(Integer element:array)
			System.out.print(element+" ");
			
		}
}

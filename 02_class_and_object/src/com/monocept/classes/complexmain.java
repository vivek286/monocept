package com.monocept.classes;

import java.util.Scanner;

public class complexmain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter real part of 1st number:");
		int r1=scanner.nextInt();
		System.out.println("enter imaginary part of 1st number:");
		int i1=scanner.nextInt();
		System.out.println("enter real part of 2nd number:");
		int r2=scanner.nextInt();
		System.out.println("enter imaginary part of 2st number:");
		int i2=scanner.nextInt();
		complex num1=new complex(r1,i1);
		complex num2=new complex(r2,i2);
		complex ans=num1.add_complex(num2);
		num1.display();
		num2.display();
		ans.display();
	}
}

package com.techlabs.test1;
import java.util.Scanner;
public class task1 {

	public static void main(String[] args) {
		System.out.println("Enter withdrawl amount: ");
		Scanner scan=new Scanner(System.in);
//		int amount=Integer.parseInt(args[0]);
		int amount=scan.nextInt();
		int two_thousand=0;
		int five_hundred=0;
		int two_hundred=0;
		int hundered=0;
		
		
			two_thousand=amount/2000;
			amount-=two_thousand*2000;
			System.out.println("two thousand : "+ two_thousand);
		
		
			five_hundred=amount/500;
			amount-=five_hundred*500;
			System.out.println("five hundred : "+ five_hundred);
		
		
			two_hundred=amount/200;
			amount-=two_hundred*200;
			System.out.println("two hundred : "+ two_hundred);
		
		
			hundered=amount/100;
			amount-=hundered*100;
			System.out.println("one hundred : "+ hundered);
		
		
		
		
		
	}
	
	
}

package com.monocept.exception;

public class Main {

	public static void main(String[] args) {
		
		try {
			int a =Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[1]);
			double c;
			c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("In exception");
		}
		
	}

}

package com.monocept.invoice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice a1=new Invoice(1212, 1000, "vivek");
		TaxCalculate.Calculate(a1);
		System.out.println(InvoicePrint.print(a1));
	}

}

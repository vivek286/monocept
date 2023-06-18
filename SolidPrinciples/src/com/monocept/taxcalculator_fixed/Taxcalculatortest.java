package com.monocept.taxcalculator_fixed;



public class Taxcalculatortest {
public static void main(String []args) {
	
	TaxCalculator t1=new TaxCalculator();
	t1.calculatetax(10000, 0,new DBLogger());
}
}

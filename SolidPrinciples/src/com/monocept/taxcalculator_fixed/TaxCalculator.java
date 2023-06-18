package com.monocept.taxcalculator_fixed;



public class TaxCalculator {
	public TaxCalculator() {
		
	}
	public int calculatetax(int amount,int rate,ILogger logger) {
		try {
			int tax=0;
			tax=amount/rate;
			return tax;
		}catch (Exception e){
			logger.log("divide by zero");
		}
		return 0;
	}
}

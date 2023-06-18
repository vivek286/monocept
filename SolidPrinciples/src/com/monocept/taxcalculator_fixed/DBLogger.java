package com.monocept.taxcalculator_fixed;

public class DBLogger implements ILogger {
	@Override
	public void log(String string) {
	System.out.println("DBLogger error: "+string);
}
}

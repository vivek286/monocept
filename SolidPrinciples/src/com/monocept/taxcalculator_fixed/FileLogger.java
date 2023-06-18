package com.monocept.taxcalculator_fixed;

public class FileLogger implements ILogger {
	@Override
	public void log(String string) {
		System.out.println("Filelogger error: "+string);
	}
}

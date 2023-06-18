package com.monocept.customer;

import java.util.Comparator;

public class comparator implements Comparator<customer> {

	@Override
	public int compare(customer arg0, customer arg1) {
		return arg0.getSalary()-arg1.getSalary();
		
	}
	public static int compare1(customer arg0, customer arg1) {
		return arg0.getEid()-arg1.getEid();
		
	}

}

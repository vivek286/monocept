package com.monocept.model;

public class InterestRates {
public static double getInterestRates(FixedDeposit fd) {
	switch(fd.getFestival()) {
	case NEWYEAR:
		return 8.0;
	case DIWALI:
		return 8.5;
	case HOLI:
		return 7.5;
	case OTHER:
		return 6.5;
		
		
}
	return 0.0;
}
}

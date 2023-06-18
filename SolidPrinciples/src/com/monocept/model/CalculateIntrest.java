package com.monocept.model;

public class CalculateIntrest {
public static void calculateSimpleIntrest(FixedDeposit fd) {
	double intrest=(fd.getDuration()*fd.getPrincipal()*fd.getInterest())/100;
	System.out.println("Simple Intrest on this account is : "+intrest);
}
}

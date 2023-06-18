package com.monocept.test;

import com.monocept.model.CalculateIntrest;
import com.monocept.model.Diwali;
import com.monocept.model.FestivalType;
import com.monocept.model.FixedDeposit;
import com.monocept.model.InterestRates;
public class FDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedDeposit fd=new FixedDeposit(77686,"Vivek",10000,5,new Diwali());
		System.out.println("Current FD Data : \n"+fd);
//		double rate=.getInterestrate();
		CalculateIntrest.calculateSimpleIntrest(fd);
	}

}

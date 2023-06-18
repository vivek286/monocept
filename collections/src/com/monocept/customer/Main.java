package com.monocept.customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<customer> customers=new ArrayList<customer>();
		customers.add(new customer(100,11,"vivek"));
		customers.add(new customer(500,2,"rohan"));
		customers.add(new customer(70,15,"atul"));
		customers.add(new customer(10,8,"shivam"));
		customers.add(new customer(1000,111,"vikram"));
		
		Collections.sort( customers,new comparator());
		for(customer cust:customers)
		System.out.println(cust);
		
	}

}

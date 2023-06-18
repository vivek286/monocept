package com.monocept.taxcalculator;

public class TaxCalculator {
DBLogger db;

public DBLogger getDb() {
	return db;
}

public void setDb(DBLogger db) {
	this.db = db;
}

public TaxCalculator() {
	
}
public int calculatetax(int amount,int rate) {
	try {
		int tax=0;
		tax=amount/rate;
		return tax;
	}catch (Exception e){
		new DBLogger().log("divide by zero");
	}
	return 0;
}
}

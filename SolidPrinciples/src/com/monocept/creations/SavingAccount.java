package com.monocept.creations;

public class SavingAccount extends Account {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public SavingAccount(long accno, double balance, String name) {
	super(accno, balance);
	this.name = name;
}

@Override
public String toString() {
	return "SavingAccount [name=" + name + "]";
}

@Override
public double getintrestrate() {
	return 7.5;
}
}

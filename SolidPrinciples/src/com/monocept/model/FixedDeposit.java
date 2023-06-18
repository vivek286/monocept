package com.monocept.model;

public class FixedDeposit {
private int accountNumber;
private String name;
private int principal;
private int duration;
private double Interest;

public FixedDeposit(int accountNumber, String name, int principal, int duration, IntrestInterface festival) {
	super();
	this.accountNumber = accountNumber;
	this.name = name;
	this.principal = principal;
	this.duration = duration;
	this.Interest = (double)festival.getInterestrate();
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public double getInterest() {
	return Interest;
}
public void setInterest(double interest) {
	Interest = interest;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrincipal() {
	return principal;
}
public void setPrincipal(int principal) {
	this.principal = principal;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}

@Override
public String toString() {
	return "accountNumber=" + accountNumber + "\n name=" + name + "\n principal=" + principal
			+ "\n duration=" + duration + "\n Intrest=" + Interest+"\n";
}

}

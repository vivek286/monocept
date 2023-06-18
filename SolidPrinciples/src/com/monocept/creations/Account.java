package com.monocept.creations;

public abstract class Account {
private long accno;
private double balance;
public long getAccno() {
	return accno;
}
public void setAccno(long accno) {
	this.accno = accno;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Account(long accno, double balance) {
	super();
	this.accno = accno;
	this.balance = balance;
}
abstract public double getintrestrate();
@Override
public String toString() {
	return "Account [accno=" + accno + ", balance=" + balance + "]";
}



}

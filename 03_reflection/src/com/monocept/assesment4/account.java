package com.monocept.assesment4;

public class account {
private int account_number;
private String name;
private int balance;
static int count=0;
public int getAccount_number() {
	return account_number;
}
public void setAccount_number(int account_number) {
	this.account_number = account_number;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public account(int account_number, String name, int balance) {
	this.count++;
	this.account_number = account_number;
	this.name = name;
	this.balance = balance;
}
public String toString() {
	return this.name+" "+this.count;
}
}

package com.monocept.streams_assingment;

public class Account {
	private int balance;
	private int accountno;
	private String name;
	public int getBalance() {
		return balance;
	}
	public Account(int balance, int accountno, String name) {
		super();
		this.balance = balance;
		this.accountno = accountno;
		this.name = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountno=" + accountno + ", name=" + name + "]";
	}
	
	
}

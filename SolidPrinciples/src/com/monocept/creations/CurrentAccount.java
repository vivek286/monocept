package com.monocept.creations;

public class CurrentAccount extends Account {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CurrentAccount(long accno, double balance, String name) {
		super(accno, balance);
		this.name = name;
	}
	@Override
	public double getintrestrate() {
		return 8.5;
	}

	@Override
	public String toString() {
		return "CurrentAccount [name=" + name + "]";
	}
}

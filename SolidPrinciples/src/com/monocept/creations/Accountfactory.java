package com.monocept.creations;

public class Accountfactory {
public static Account genrateAccount(String type) {
	if(type.equals("saving")) {
		return new SavingAccount(12512,1111,"vivek");
	}
	if(type.equals("current")) {
		return new CurrentAccount(12512,1111,"vilay");
	}
	return null;
}
}

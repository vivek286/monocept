package com.monocept.creations;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=Accountfactory.genrateAccount("saving");
		Account a2=Accountfactory.genrateAccount("current");
		System.out.println(a1);
		System.out.println(a2);
	}

}

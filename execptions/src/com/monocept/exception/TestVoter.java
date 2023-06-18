package com.monocept.exception;

public class TestVoter {

	public static void main(String[] args) {
		Voter voter=null;
		try {
			voter=new Voter(78,"abc",2);
		}catch (ageNotValid e) {
			System.out.println(e.getMessage());
		}
			System.out.println(voter);	

	}

}

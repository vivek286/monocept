package com.monocept.exception;

public class ageNotValid extends RuntimeException {
 
	int age;
	public ageNotValid(int age) {
		this.age=age;
	}
	public String getMessage() {
		return "Invalid age of candidate";
	}
}

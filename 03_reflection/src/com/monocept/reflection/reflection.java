package com.monocept.reflection;

public class reflection {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class stringReflect=Class.forName("java.lang.String"); 
		System.out.println(stringReflect.getClass());

	}

}

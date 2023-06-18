package com.monocept.lambda;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer>large=(num1,num2)-> num1>num2;
		
		System.out.println(large.test(10, 20)?"Number 1 is greater":"Number 2 is greater");
		Function<Integer,Integer>factFun = null;
	factFun=(number)-> (number==1)? 1:factFun.apply(number-1);
	System.out.println(factFun.apply(5));
		
	}

}

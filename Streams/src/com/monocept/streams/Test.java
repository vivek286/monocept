package com.monocept.streams;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String>names=Arrays.asList("jayesh","nimesh","mahesh","ramesh");
		names.stream().forEach((name)->System.out.println(name));
		names.stream().filter((name)->name.charAt(0)-'p'==0).forEach((name)->System.out.println(name));
		names.forEach(System.out::println);
		
	}

}

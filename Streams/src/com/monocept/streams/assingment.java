package com.monocept.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class assingment {

	public static void main(String[] args) {
		String[] names = {"Jay", "Nimesh", "Mark", "Mahesh", "Ramesh"};
		System.out.println("Section a: ");
		Arrays.stream(names).sorted().limit(3).forEach(System.out::println);
		System.out.println("Section b: ");
		Arrays.stream(names).filter(name -> name.contains("a")).sorted().limit(3).forEach(System.out::println);
		System.out.println("Section c: ");
		Arrays.stream(names).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("Section d: ");
		Arrays.stream(names).map(name -> name.substring(0, 3)).forEach(System.out::println);
		System.out.println("Section e: ");
		Arrays.stream(names).filter(name -> name.length() <= 4).forEach(System.out::println);
		
		System.out.println("Assingment 2 : ");
		List<Integer>number=Arrays.asList(10,20,30,40,35,25,55,50);
		Optional<Integer> min = number.stream().min(Integer::compareTo);
		Optional<Integer> max = number.stream().max(Integer::compareTo);
		System.out.println(min+" "+max);
	}

}

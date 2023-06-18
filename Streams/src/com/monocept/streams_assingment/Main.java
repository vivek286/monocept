package com.monocept.streams_assingment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

//	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		List<Account>accounts=Arrays.asList(new Account(100,1010,"vivek"),
		new Account(10000,101,"vilay"),
		new Account(23873,2020,"varun"),
		new Account(2323,200,"sanidhaya")
				);
		Account accountWithMaxBalance = accounts.stream().max((a1, a2) -> Integer.compare(a1.getBalance(), a2.getBalance())).orElse(null);
		Account accountWithMinBalance = accounts.stream().min((a1, a2) -> Integer.compare(a1.getBalance(), a2.getBalance())).orElse(null);
		System.out.println("minimum account"+accountWithMinBalance);
		System.out.println("maximum account"+accountWithMaxBalance);
		accounts.stream()
        .filter(account -> account.getName().length() > 6)
        .forEach(account -> System.out.println(account.getName()));
		int total=accounts.stream().mapToInt(Account::getBalance).sum();
		System.out.println(total);
	}

}

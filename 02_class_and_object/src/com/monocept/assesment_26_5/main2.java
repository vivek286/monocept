package com.monocept.assesment_26_5;

import java.util.Scanner;



public class main2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter numbers of account : ");
		int number =scanner.nextInt();
		account array[]=new account[number];
		for(int i=0;i<number;i++) {
			System.out.println("Enter name of account "+(i+1)+": ");
			String name=scanner.next();
			System.out.println("Enter Account type (saving/current/joint)");
			String user_acc_type=scanner.next();
			System.out.println("Enter Account Balance");
			int balance=scanner.nextInt();
			array[i]=new account((i+11),balance,name,acc_type.valueOf(user_acc_type));
		}
		System.out.println("Account with maximum balance is : \n");
		new account().max_balance(array);
		
		for(account temp:array)	
		System.out.println(temp);

	}

}

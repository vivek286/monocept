package com.monocept.account;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Account a1=getaccountdetails();
			while(a1==null) {
				a1=getaccountdetails();
			}
			System.out.println("Press the number for action \n 1. Deposit \n 2. withdraw \n 3. check balance");
		    Scanner scanner=new Scanner(System.in);
		    int option=scanner.nextInt();
		    if(option==1) {
		    	System.out.println("Enter ammount to deposit");
				int ammount=scanner.nextInt();
		    	a1.deposit(ammount);
		    }
		    if(option==2) {
		    	System.out.println("Enter ammount to withdraw");
				int ammount=scanner.nextInt();
				a1.withdraw(ammount);
		    }
		    if(option==3) {
		    	System.out.println(a1.getBalance());
		    }
		
		
		
		
		
		}catch(AccountException e) {
			System.out.println(e.getMessage());
		}
	}

	public static Account getaccountdetails() {
		Account a1=null;
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter account no");
			int accno=scanner.nextInt();
			System.out.println("Enter name");
			String name=scanner.next();
			System.out.println("Enter account type");
			String type=scanner.next();
			System.out.println("Enter balance");
			int balance=scanner.nextInt();
			a1=new Account(accno,name,AccountType.valueOf(type),balance);
		}catch(AccountException e) {
			System.out.println("Exception: "+e.getMessage());
		}
		
		return a1;
		
	}

}

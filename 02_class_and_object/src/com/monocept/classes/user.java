package com.monocept.classes;

import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of employes :");
		int number=scanner.nextInt();
		employe array[]=new employe[number];
		int count=0;
		while(count<number) {
			System.out.println("Enter employe "+(count+1)+ " name :");
			String name=scanner.next();
			System.out.println("Enter employee "+(count+1)+ "salary :");
			int salary =scanner.nextInt();
			array[count]=new employe(name,count,salary);
			count++;
		}
		for(employe temp:array) {
			System.out.println("name :"+temp.getName()+ " Salary : "+temp.getSalary()+" eid : "+temp.getEid());
		}
	}

}

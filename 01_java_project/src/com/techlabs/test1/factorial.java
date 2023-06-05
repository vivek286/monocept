package com.techlabs.test1;

import java.util.Scanner;

public class factorial {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter number");
	int number=scanner.nextInt();
	int i=number;
	int ans=1;
	while(i>1) {
		ans*=i;
		i--;
	}
	System.out.println(ans);
}
}

package com.techlabs.test1;

import java.util.Scanner;

public class addmatrices {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter no of rows and column");
	int n=scanner.nextInt();
	int m=scanner.nextInt();
	System.out.println("Enter elements of first matrices");
	int matrix1[][]=new int[n][m];
	int matrix2[][]=new int[n][m];
	int ans[][]=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			matrix1[i][j]=scanner.nextInt();
		}
	}
	System.out.println("Enter elements of second matrix");
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			matrix2[i][j]=scanner.nextInt();
		}
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			ans[i][j]=matrix1[i][j]+matrix2[i][j];
		}
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			System.out.print(ans[i][j]+" ");
		}
		System.out.println();
	}
}
}

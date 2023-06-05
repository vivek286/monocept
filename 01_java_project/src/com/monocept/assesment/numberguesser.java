package com.monocept.assesment;

import java.util.Random;
import java.util.Scanner;

public class numberguesser {
	
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Lets start game \n Guess the number you can only have 10 guess  \n to Quit enter 0");
	Random random = new Random();   
	int chance=10;
	int inital_number = random.nextInt(101);   
	System.out.println("Random number"+inital_number);
	int guess=scanner.nextInt();
	while(guess!=0&&chance-->0) {
		if(guess==inital_number) {
			System.out.println("You Guessed Right your attempts"+(10-chance));
			break;
		}else if(guess>inital_number) {
			System.out.println("Too High");
		}else {
			System.out.println("Too Low");
			
		}
		guess=scanner.nextInt();
	}
	System.out.println("Game Over");
	
	
}

}

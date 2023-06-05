package com.monocept.assesment4;

import java.util.Random;
import java.util.Scanner;

public class RandomWord {
	public static String randomStringGenrator() {
		String randomString="";
		Random random = new Random();
		int length=random.nextInt(6)+5;
		for(int i=0;i<length;i++) {
			randomString+=(char)('a'+random.nextInt(26));
		}
		return randomString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("lets Start the Game !!");
		String Word=randomStringGenrator();
		int lives=10;
		StartGame(Word,lives,scanner);
		System.out.println("Game Over Thankyou for playing");
		

	}
	
	public static void StartGame(String Word,int lives,Scanner scanner) {
		boolean all_gussed=false;
		int word_place=1;
		System.out.println("Word is : "+Word);
		while(lives>0&&word_place<=Word.length()) {
			System.out.println(" Guess the "+word_place+" letter ");
			char character=scanner.next().charAt(0);
			if(character==Word.charAt(word_place-1)) {
				word_place++;
				printword(Word,word_place);
			}else {
				lives--;
				System.out.println(" Oops Wrong Gusses TRy again \n lives left:- "+lives);
			}
			
		}
		if(lives>0)System.out.println("You Won ");
		else {
			System.out.println("Sorry You Loose");
		}
		
	}
	public static void printword(String word, int word_place) {
		System.out.println("Greate correct Gusses \n Word looks like :-");
		for(int i=1;i<=word.length();i++) {
			if(i<word_place) {
				System.out.print(word.charAt(i-1)+" ");
			}else {
				System.out.print("_ ");
			}
		}
		if(word.length()!=word_place)System.out.println("\n Now lets move to next letter ");
		
		
	}

}

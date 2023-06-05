package com.techlabs.test1;
import java.util.Scanner;
public class treasure_hunt {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Treasure Hunt \nYour mission is to find Treasure \n\n Lets Start!! \n Do you want to move left or right");
		String response1=scan.next();
		if(response1.equals("left")) {
			System.out.println("Great you moved to next checkpoint \n now do you want to wait or swim");
			String response2=scan.next();
			if(response2.equals("wait")) {
				System.out.println("Now you are close to Treasure \n now which door do you want to pick red, yellow or blue");
				String response3=scan.next();
				if(response3.equals("red")) {
					System.out.println("Burn by fire\n Game Over");
				}else if(response3.equals("blue")) {
					System.out.println("Eaten by beast\n Game Over");
				}else if(response3.equals("yellow")) {
					System.out.println("Congrats you win!!!!! \n Game Over");
				}else {
					System.out.println("OOPS you are wrong\n Game Over");
				}
			}else {
				System.out.println("Attack by beast \n Game Over");
			}
		}else {
			System.out.println("You fall in pit \n Game Over");
		}
		
	}
}

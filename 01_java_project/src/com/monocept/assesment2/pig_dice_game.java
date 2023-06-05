package com.monocept.assesment2;

import java.util.Scanner;
import java.util.Random;
public class pig_dice_game {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int count_turns=1;
		System.out.println("Lets Start Game!! \n to quit enter 0 \n");
		int score=0;
		
		Random random = new Random();
		while(score<20) {
			
			System.out.println("Roll or hold? (r/h) ");
			String response=scanner.next();
			if(response.equals("0"))break;
			if(response.equals("h")) {
				System.out.println(" Score for Turn "+score);
				count_turns++;
				System.out.println(" TURN: "+count_turns);
			}else {
				int dice_number = random.nextInt(6)+1;
				System.out.println("Dice :"+dice_number);
				if(dice_number==1) {
					System.out.println(" Score for Turn "+0);
					count_turns++;
					System.out.println(" TURN: "+count_turns);
					score=0;
					
				}
				else {
					score+=dice_number;
				}
			}
			
		}
		System.out.println("Game Over\n Total Score :"+score+"\n number of turns : "+count_turns);

	}

}

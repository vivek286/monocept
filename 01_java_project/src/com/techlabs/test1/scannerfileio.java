package com.techlabs.test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scannerfileio {

	public static void main(String[] args) throws FileNotFoundException {
		File text = new File("D:/javainput.txt");
		Scanner scanner=new Scanner(text);
		int wordcount = 0;
        int charactercount = 0;
        int linecount = 0;
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
//			System.out.println(line);
			charactercount+=line.length();
			linecount++;
			wordcount+=line.split(" ").length;
			
			
		}
		System.out.println("wordcount : "+wordcount+" \n charactercount : "+charactercount+"\n linecount : "+linecount);

	}

}

package com.techlabs.test1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class countlines {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("D:/javainput.txt");
		InputStreamReader inputstream = new InputStreamReader(fin);
        BufferedReader reader = new BufferedReader(inputstream);
        String line=reader.readLine();
        int wordCount = 0;
        int characterCount = 0;
        int linecount = 0;
        while(line!=null) {
        	linecount++;
        	wordCount+=line.split(" ").length;
        	characterCount+=line.length();
        line=reader.readLine();
        }
        System.out.println("wordcount : "+wordCount+" \n charactercount : "+characterCount+"\n linecount : "+linecount);
        

	}

}

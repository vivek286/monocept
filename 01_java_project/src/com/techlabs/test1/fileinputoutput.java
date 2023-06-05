package com.techlabs.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class fileinputoutput {
public static void main(String[] args) throws IOException {
	FileInputStream fin=new FileInputStream("D:/javainput.txt");
	FileOutputStream fout=new FileOutputStream("D:/output2.txt");
	int i=fin.read();
	String file_text="";
	while(i!=-1) {
		file_text=file_text.concat(""+(char)i);
		fout.write(i);
		i=fin.read();
	}
	FileWriter output= new FileWriter("D:/output.txt");
	
	output.write(file_text);
	
	System.out.println("Copied Sucessfully");
	 
}
}

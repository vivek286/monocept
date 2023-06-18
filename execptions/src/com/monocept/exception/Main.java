package com.monocept.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try (FileInputStream fin=new FileInputStream("D:/javainput.txt")){
			
			int i=fin.read();
			String file_text="";
			while(i!=-1) {
				file_text=file_text.concat(""+(char)i);
//				
				i=fin.read();
			}
			System.out.println(file_text);
		}catch(ArithmeticException e){
			
			System.out.println("In exception");
			
		} catch (FileNotFoundException e1) {
			
			System.out.println("In FileNotFoundException");

		} catch (IOException e1) {
			
			System.out.println("In IOException ");
			
		}
		finally {
			
			System.out.println("In Finally block");
		}
		System.out.println("Bye Bye");
		scanner.close();
		
	}

}

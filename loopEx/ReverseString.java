package com.codeTest;

import java.util.Collections;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		String reverse="";
		//Option 1
//		for(int i=input.length()-1;i>=0;i--) {
//			
//			reverse=reverse+input.charAt(i);
//			
//		}
//		System.out.println(reverse);
		
		//Option 2 with Character array
		char[] letters = new char[input.length()];
		int indexchar=0;
		for(int i = input.length() - 1 ;i>=0;i--) {
			
			letters[indexchar]=input.charAt(i);
			indexchar++;
		}
		
		for(int i=0;i<input.length();i++) {
			
			reverse=reverse+letters[i];
		}
		
		System.out.println("using char array: "+reverse);
		
		//Option 3 using StringBuilder class
		StringBuilder str = new StringBuilder();
		str.append(input);
		
		System.out.println("Using StringBuilder: "+str.reverse());
	}

	
}

package com.codeTest;

import java.util.Scanner;

public class RemoveSpacefromString {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		System.out.println(removeSpace(str));
		
		//Strip method to remove leading spaces in a string. 
		String s = "  abc  def\t"; 
		s = s.strip();
		System.out.println(s);
		
	}
	
	public static String removeSpace(String input) {
		
		StringBuilder output = new StringBuilder();
		
		char[] charArr = input.toCharArray();
		
		for(char c: charArr) {
			
			if(!Character.isWhitespace(c)) {
				output.append(c);
			}
		}
		return output.toString();
	}

}

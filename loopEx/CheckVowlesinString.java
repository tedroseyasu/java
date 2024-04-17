package com.codeTest;

import java.util.Scanner;

public class CheckVowlesinString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		boolean flag = false;
		String input = scan.nextLine();

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u')
				flag = true;
		}
		if (flag == true)
			System.out.println("There is a Vowel in the String");
		else
			System.out.println("There is no Vowels in the String");
		// using regular expression.

		System.out.println(CheckVowles(input));

	}

	public static boolean CheckVowles(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");
	}

}

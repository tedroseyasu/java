package com.codeTest;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = scan.nextInt();

		System.out.println(isPrime(input));
		
	}
	public static boolean isPrime(int input) {
		if (input==0 ||input==1)
			return false;
		if(input==2)
			return true;
		for (int i = 2; i <= input/2; i++) {

			if (input % i == 0) 
				return false;
	 }
	return true;
}
}

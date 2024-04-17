package com.codeTest;

public class ReverseIntegerDigits {

	public static void main(String[] args) {
		
		int n=472;
		int remainder=0;
		int reverse=0;
		
		while(n>0) {
			
			remainder=n%10;
			n=n/10;
			reverse=reverse*10+remainder;
			
		}
		System.out.println(reverse);
	}

}

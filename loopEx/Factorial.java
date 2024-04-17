package com.codeTest;

public class Factorial {

	public static void main(String[] args) {
		
		int re=1;
		int n=4;
		
		for (int i=n;i>=1;i--) {
			re=re*i;
		}
		System.out.println("factorial of "+n+ " is " + re);
	}

}

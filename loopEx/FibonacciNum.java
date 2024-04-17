package com.codeTest;

public class FibonacciNum {

	
	public static void Fib(int n) {
		
		int num1=0, num2=1;
		
		for (int i=0;i<n;i++) {
			
			System.out.print(num1+ " ");
			int sum=num1+num2;
			num1=num2;
			num2=sum;
		}	
		
	}
	public static void main(String[] args) {
		int n=10;
		
		Fib(n);

	}
	
	

}

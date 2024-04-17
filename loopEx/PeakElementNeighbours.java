package com.codeTest;

public class PeakElementNeighbours {

	public static void main(String[] args) {

		
		int[] arr = {10,2,5,7,6,9,3};
		
		for (int i=1;i<arr.length-1;i++) {
			
			if (arr[i]>(arr[i-1]) && arr[i]>arr[i+1]) {
				
				System.out.println(arr[i]);
			}
		}
		
	}
}

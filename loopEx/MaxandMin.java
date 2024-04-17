package com.codeTest;

public class MaxandMin {

	public static void main(String[] args) {
		int[] arr = { 3,3,3, 6, 1,1, 8,8, 4 };
		int[] reverse = new int[arr.length];

		int min = 0, max = 0;
		// Max
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println(max);
		// Min
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max)
				min = arr[i];
		}
		System.out.println(min);
		// reverse the array
		for (int i = 0; i < arr.length; i++) {
			reverse[i] = arr[arr.length-1 - i];

		}
		for (int i : reverse) {

			System.out.print(i + " ");
		}
		System.out.println();
		// Sorting an array
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j< arr.length-1; j++) {

				if (arr[j+1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

				}

			}
		}
		for (int i : arr) {

			System.out.print(i + " ");
		}
	}
	//Same numbers next each other
	

}

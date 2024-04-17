package com.codeTest;

public class SwapwithnoThirdVar {

	public static void main(String[] args) {

		int a = 4, b = 6;
		b = a + b;// 10
		a = b - a;// 6 = 10-4
		b = b - a;// 4 = 10-6

		//System.out.println(a + "  " + b);

		//Deleting an element from an array
		int[] arr = {10, 5, 2, 4, 3};
		int[] newArray=new int[arr.length-1];
		int key = 2;

		for (int i = 0, k=0; i < arr.length; i++) {
			if (arr[i] != key) {
				newArray[k]=arr[i];
				//System.out.println(arr[i]);
				k++;
			}
		}
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i]+" ");
		}

	}
}

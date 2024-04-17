package com.codeTest;

public class ZeroOdd {

	public static void main(String[] args) {

		int[] arr = { 10, 2, 3000, 200, 30, 26};
		int[] withZeros = new int[arr.length];

		int rem = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int counter = 0;
			if (temp >= 10) {
				while (temp >=10) {
					rem = temp % 10;
					if (rem == 0)
						counter++;
					temp = temp / 10;
				}
			}
			if (counter % 2 == 1) {
				withZeros[i] = arr[i];
			}

		}

		for (int i = 0; i < withZeros.length; i++) {
			if (withZeros[i] != 0) {
				System.out.print(withZeros[i]+" ");
			}
		}

	}
}

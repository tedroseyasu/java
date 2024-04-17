package com.codeTest;
public class freqOfInteger {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,1,2,2,3,3,3,3,4,4,5};
		
		int[] freq = new int[arr.length];
		
		int maxCount=0;
		int checked=1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(freq[i]==1)
				continue;
			
			int counter=1;
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
					freq[j]=checked;
					counter++;
					if (counter>maxCount)
						maxCount=arr[i];
				}
				
			}
			
			System.out.println(arr[i] +" Appears "+counter + " Times");
			
		}
		System.out.println("Most Frequent number is: "+maxCount);

	}

}

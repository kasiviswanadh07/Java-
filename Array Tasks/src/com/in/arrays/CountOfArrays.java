package com.in.arrays;

public class CountOfArrays {

	public void CountEvenOrOdd(int arr[]) {
		int evencount=0;
	    int oddcount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evencount++;
				
			}else {
				oddcount++;
			}
		}System.out.println("Even Numbers: "+evencount);
		System.out.println("Odd Numbers: "+oddcount);
	}

	
}

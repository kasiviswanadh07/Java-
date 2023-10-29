package com.in.arrays;

public class MergeArrayApp {
	public int[] MergeArray(int arr[],int[]brr) {
		int crr[]=new int[arr.length+brr.length];
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i];
		}
		for(int i=0;i<brr.length;i++) {
			crr[arr.length+i]=brr[i];
		}return crr;
	}
    
    
}

package com.kn.Arrays;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of arrays");
        int num=scan.nextInt();
		
		System.out.println("Enter the size of an array 1");
		int arr[] = new int[scan.nextInt()];

		System.out.println("Enter the size of an array 2");
		int brr[] = new int[scan.nextInt()];

		System.out.println("Enter the size of an array 3");
		int crr[] = new int[scan.nextInt()];

		System.out.println("Enter the values of an array 1");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the values of an array 2");
		for (int i = 0; i < brr.length; i++) {
			brr[i] = scan.nextInt();
			
		}
			FindSumAndProduct(arr ,brr,crr);
		}
	
	

	 static void FindSumAndProduct(int[] arr, int[] brr, int[] crr) {
		for(int i=0;i<crr.length;i++) {
			crr[i]=arr[i]+brr[i];
			System.out.println("The sum of two arrays is :"+crr[i]);
			System.out.println("The product of an two arrays is: "+arr[i]*brr[i]);
	}
		
		
	}

}

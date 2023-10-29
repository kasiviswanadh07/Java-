package com.kn.Arrays;

import java.util.Scanner;

public class SumOf2DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of arr");


		int arr[][] = new int[scan.nextInt()][scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println("Enter the values of brr ");
		int brr[][] = new int[scan.nextInt()][scan.nextInt()];
		
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				brr[i][j] = scan.nextInt();
			}
		}
//		int crr[][] = new int[scan.nextInt()][scan.nextInt()];

		sum(arr, brr);

	}
// array traversversing

	public static void sum(int[][] arr, int[][] brr) {
	System.out.println(" ****out put****");
	
		for (int i = 0; i < arr.length; i++) {
			int crr[][] = new int[arr.length][arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
            crr[i][j]=arr[i][j]+brr[i][j];
            System.out.print(crr[i][j]+" ");
			}
		}
		System.out.println();
	
	}
}

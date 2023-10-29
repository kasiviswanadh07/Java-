package com.kn.Arrays;

import java.util.Scanner;

public class CountThePositiveNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");

//     array declaration and creation
		int arr[] = new int[scan.nextInt()];

//     array initialisation
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the number " + (i + 1) + " is :");
			arr[i] = scan.nextInt();
		}
		scan.close();

//    	 method to find the count of an array
		int isfindNum = PositiveNumber(arr);
		System.out.println("The count of positive numbers : " + isfindNum);

	}

	public static int PositiveNumber(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				count++;
			}
		}
		return count;

	}

}

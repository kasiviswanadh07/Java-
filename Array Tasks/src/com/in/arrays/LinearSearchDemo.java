package com.in.arrays;

import java.util.Scanner;

public class LinearSearchDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int[] arr = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the values of an array= " + (i + 1));
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the key element to search");
		int keyElement = scan.nextInt();
		LinearSearch search = new LinearSearch();
		search.isfound(arr, keyElement);
		scan.close();
	}

}

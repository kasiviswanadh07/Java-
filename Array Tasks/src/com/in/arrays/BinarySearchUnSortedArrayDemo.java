package com.in.arrays;

import java.util.Scanner;

public class BinarySearchUnSortedArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Elements of an Array " + (i + 1));
			arr[i] = scan.nextInt();

		}
		BinarySearchUnSortedArray sorting = new BinarySearchUnSortedArray();
		sorting.BobbleSorting(arr);
		

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		    System.out.println();
			System.out.println("Enter the key to search");
			int key = scan.nextInt();
			BinarySearchUnSortedArray binarySearch = new BinarySearchUnSortedArray();
			System.out.println(binarySearch.Searching(arr, key));
			scan.close();

		}

	}



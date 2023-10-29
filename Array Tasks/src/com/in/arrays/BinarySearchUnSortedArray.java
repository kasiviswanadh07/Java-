package com.in.arrays;

public class BinarySearchUnSortedArray {

	public int[] BobbleSorting(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public int Searching(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (key > arr[mid]) {
				low = mid + 1;
			}else {
				high=mid-1;
			}    
		}
//	System.out.println("The Enter key is found in a Array at the index: "+mid);
	return mid;

		
	}
}

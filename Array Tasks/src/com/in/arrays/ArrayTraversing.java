package com.in.arrays;

public class ArrayTraversing {

//	

	public void printarrayelemnets(int arr[]) {
		System.out.println("********");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}
//   Backward Traversing
		System.out.println("++++++++");
		for (int i =arr.length-1; i >=0; i--) {
			System.out.println(arr[i] + " ");
			
		}
	}
}

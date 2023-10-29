package com.in.arrays;

public class LinearSearch {

	public boolean isfound(int[] arr, int keyElement) {
		boolean isFound = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==keyElement) {
				isFound = true;
				break;
			}
		}
		if (isFound == true) {
			System.out.println(keyElement + " Keyelement is found "+isFound);
		} else {
			System.out.println(keyElement + " keylement not found");
		}

		return true;
	}

}

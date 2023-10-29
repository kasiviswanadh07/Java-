package com.in.arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };

		boolean isfound=found(arr);
		System.out.println(isfound);
	

	}

	static boolean found(int[] arr) {
		 Scanner scan=new Scanner(System.in);
		int low=0, high=arr.length-1,position=-1;
		int mid=0;
		boolean found=false;
		System.out.println("Enter the element for searching");
		int element=scan.nextInt();
		
		
		while(low<=high) {
			mid=(low+high)/2;
			if(element==arr[mid]) {
				
			    position=mid+1;
				found= true;
				break;
			}else if(element>arr[mid]) {
					low=mid+1;
					high=high;
					}else {
						high=mid-1;
						low=low;	
				} 
				
				}
			System.out.println("**********");
			if(found) {
				System.out.println(element+" is found in a given array");
			}else {
				System.out.println("Element not found in a array");
			}
			
		
		scan.close();

	return found;
	
}

}
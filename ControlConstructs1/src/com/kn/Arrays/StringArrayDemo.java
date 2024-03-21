package com.kn.Arrays;

import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
////       array declaration
//		String arr[];
////		array initialisation
//		System.out.println("Enter the size of string");
//		arr=new String[scan.nextInt()];
//		
////		array traversing
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Enter the" +(i+1)+" string data");
//			arr[i]=scan.next();
//		}
//	    for(int i=0;i<arr.length;i++) {
//	    	System.out.println(arr[i]);
//	    }
		
//		array declration
		String arr[];
//		arry creation
		System.out.println("Enter the size of string");
		arr=new String[scan.nextInt()];
		
//		array initialisation
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+"string data");
			arr[i]=scan.next();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		scan.close();
		
	}

}

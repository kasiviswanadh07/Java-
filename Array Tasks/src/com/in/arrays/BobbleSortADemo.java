package com.in.arrays;

import java.util.Scanner;

public class BobbleSortADemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");

		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the values of an array");
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=scan.nextInt();
	}
	     System.out.println(">>>>>>>>Before sorting<<<<<<<<<<");
	     for(int i=0;i<arr.length;i++) {
	    	 System.out.print(arr[i]+" ");
	    	
	     }
	     System.out.println(" ");
//    	  boolean bobblesorting=bobble(arr);
//    	System.out.println(bobblesorting);

		BobbleSortApp bobblesorting = new BobbleSortApp();
		bobblesorting.BobbleSorting(arr);
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+" ");

		}
	}
}

//	public static boolean bobble(int arr[]) {
//		int temp=0;
//	
////		  System.out.println("*******");
//    	  for(int i=0;i<arr.length;i++){
//    		  boolean count=false;
//    		 
//    		   
//    	  for(int j=0;j<arr.length-1-i;j++) {
//    		  if(arr[j]>arr[j+1]) {
//    			 arr[j]=arr[j]+arr[j+1];
//               arr[j+1]=arr[j]-arr[j+1];
//               arr[j]=arr[j]-arr[j+1];
//    			  count=true;
//    		  }
//    		  
//    	  }if(count==false) {
//    		  break;
//    	  }
//    	  }
//		return true;

package com.in.arrays;

import java.util.Scanner;

public class ThreeDArrayDemo {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the size of an array arr");
      int arr[]=new int[scan.nextInt()];
      System.out.println("Enter the size of an brr");
      int brr[]=new int[scan.nextInt()];
      System.out.println("Enter the size of an crr");
      int crr[]=new int[scan.nextInt()];
      
      System.out.println("Enter the values of arr");
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=scan.nextInt();
      } 
      System.out.println("Enter the values of brr");
      for(int i=0;i<brr.length;i++) {
    	  brr[i]=scan.nextInt();
      }
      System.out.println("Enter the values of crr");
      for(int i=0;i<crr.length;i++) {
    	 crr[i]=scan.nextInt();
      }
      int []drr=mergearray(arr,brr,crr);
      for(int i=0;i<drr.length;i++) {
    	 System.out.print(drr[i]+" ");
      }
      scan.close();
	}
     
	 static int[] mergearray(int[] arr, int[] brr, int[] crr) {
		 System.out.println("***********");
		int drr[]=new int[arr.length+brr.length+crr.length];
		for(int i=0;i<arr.length;i++) {
			drr[i]=arr[i];
		}
		for(int i=0;i<brr.length;i++) {
			drr[arr.length+i]=brr[i];
		}
		for(int i=0;i<crr.length;i++) {
			drr[arr.length+brr.length+i]=crr[i];
//			System.out.println(drr[i]+" ");
		}
		return drr;
		
		
	}

}

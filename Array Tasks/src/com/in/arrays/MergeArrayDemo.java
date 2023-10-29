package com.in.arrays;

import java.util.Scanner;

public class MergeArrayDemo {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the size of an array arr");
       int arr[]=new int[scan.nextInt()];
       System.out.println("Enter the size of an array brr");
       int brr[]=new int[scan.nextInt()];
       
//       array initialisation
       System.out.println("Enter the values of an array");
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=scan.nextInt();
       }
       System.out.println("Enter the values of an array of brr");
       for(int i=0;i<brr.length;i++) {
    	   brr[i]=scan.nextInt();
       }
       MergeArrayApp mergearrays=new MergeArrayApp();
       int crr[]=mergearrays.MergeArray(arr,brr);
       for(int i=0;i<crr.length;i++) {
    	   System.out.print(crr[i]+" ");  
       }
       
       
       
	}

}

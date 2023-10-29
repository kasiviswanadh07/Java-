package com.in.arrays;

import java.util.Scanner;

public class CountOfArraysDemo {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the size of an array");
     
//     array declaration and creation
     int []arr=new int[scan.nextInt()];
     
//     array initialisation
     for(int i=0;i<arr.length;i++) {
    	 System.out.println("Enter the element "+(i+1));
    	 arr[i]=scan.nextInt();
     }
//     object creation
     CountOfArrays countevenandodd=new CountOfArrays();
    	 countevenandodd.CountEvenOrOdd(arr);
    	 
     
    scan.close();
}
}

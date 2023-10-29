package com.in.arrays;

import java.util.Scanner;

public class SumOfArrayElementsDemo {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the size of an Array");
     
//     array declaration and creation
     int arr[]=new int[scan.nextInt()];
     
//     array initialisation
     for(int i=0;i<arr.length;i++) {
    	 System.out.println("Enter the elements :"+(i+1));
    	 arr[i]=scan.nextInt();
     }
//     object creation
     SumOfArrays arraytraversing=new SumOfArrays();
//    	 arraytraversing.SumOfElements(arr);
    	
	System.out.println( arraytraversing.SumOfElements(arr));
     }
	
}

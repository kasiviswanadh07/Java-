package com.in.arrays;

import java.util.Scanner;

public class BobbleSortingDemo {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the size of an array");
//       Array creation and Declaration
       int[]arr=new int[scan.nextInt()];
       System.out.println("Enter the values of an Array");
       
//       Array initialisation
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=scan.nextInt();
       }
       System.out.println("<<<<Beforesorting>>>>");
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
//      object creation
       BobbleSorting bubblesort=new  BobbleSorting();
       bubblesort.Bubble(arr);
       
       System.out.println("");
       System.out.println("<<<<Sorted Array>>>>");
//       for(int i:bubblesort.Bubble(arr)) {
//    	   System.out.print(arr[i]+" ");
//       }
//       System.out.println("");
//       System.out.println("<<<<Sorted Array>>>>");
        for(int i=0;i<arr.length;i++) {   
    	  System.out.print(arr[i]+" ");
       }
	}

}

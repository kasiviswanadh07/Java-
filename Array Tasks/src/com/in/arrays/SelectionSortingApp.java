package com.in.arrays;

import java.util.Scanner;

public class SelectionSortingApp {

	public static void main(String[] args) {
       Scanner scan=new  Scanner(System.in);
       System.out.println("Enter the Size of an Arrray");
//       Array creation and declaration
       int []arr=new int [scan.nextInt()];
//     Array initialisation
       System.out.println("Enter the values of an Array");
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=scan.nextInt();  
       }
       System.out.println("<<<<<Before sorting>>>>>");
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       
       SelectionSorting sort= new SelectionSorting();
       int res[]=sort.selectionsort(arr);
       System.out.println();
       System.out.println("after sorting");
        for ( int i : res) {
			System.out.print(i);
		}
//       System.out.println("");
//       System.out.println("<<<<<After Sorting >>>>>");
//       for(int i=0;i<arr.length;i++) {
//    	   System.out.print(arr[i]+" ");
       }
       
	}


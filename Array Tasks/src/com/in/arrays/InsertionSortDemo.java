package com.in.arrays;

import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of an Array");
//        Array creation and Declaration
        int arr[]=new int[scan.nextInt()];
        System.out.println("Enter the values of an Array");
        
//        Array initialisation
        for(int i=0;i<arr.length;i++) {
        	arr[i]=scan.nextInt();
        }
        System.out.println("<<<<Array Before Sorting>>>>");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
//        Method creation and Method calling
        InsertionSortApp insertionsorting=new InsertionSortApp(); 
        insertionsorting.Sorting(arr);
        
        System.out.println(""); 
        System.out.println("<<<<sorted Array>>>>");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        scan.close();
        
	}

}

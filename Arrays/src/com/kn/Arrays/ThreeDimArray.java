package com.kn.Arrays;

import java.util.Scanner;

public class ThreeDimArray {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the size of an array");
       int arr[][][]=new int[scan.nextInt()][][];
       
      
       for(int i=0;i<arr.length;i++) {
    	   System.out.println("Enter the Array"+(i+1));
    	   arr[i]=new int[scan.nextInt()][];
       
    	   
    	
    	for(int j=0;j<arr[i].length;j++) {
    		System.out.println("Enter the No.of indexing"+j);
    		arr[i][j]=new int[scan.nextInt()];
    	
    		
    	 for(int k=0;k<arr[i][j].length;k++) {
    		 System.out.println("Element"+(k+1));
    		 arr[i][j][k]=scan.nextInt();
    	 }
    	} 
	}
       System.out.println("*******");
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0;j<arr[i].length;j++) {
    		   for(int k=0;k<arr[i][j].length;k++) {
    			   System.out.println(arr[i][j][k]);
    		   }
    	   }
       }
} }

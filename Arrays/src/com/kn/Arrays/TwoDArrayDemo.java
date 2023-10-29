package com.kn.Arrays;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("");
//      array declaration
      int arr[][];
      
//      array creation
      arr=new int[2][];
//      arr=new int[][];
      
//      array initialization
//      arr[0][0]=10;
//      arr[0][1]=20;
//      arr[0][2]=30;
//      arr[1][0]=40;
//      arr[1][1]=50;  
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("Enter the 1D "+(i+1)+"data");
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.println("Enter the 2D "+(j+1)+"data");
    		  arr[i][j]=scan.nextInt();
    	  }
      }
      
//      array Traversing
      for(int i=0;i<=arr.length;i++) {
    	System.out.println();
    	  for(int j=0;j<=arr[i].length;j++) {
    		 System.out.println();
    		  System.out.println(arr[i][j]);  
    	  }
    	  
      }scan.close();
	}

}

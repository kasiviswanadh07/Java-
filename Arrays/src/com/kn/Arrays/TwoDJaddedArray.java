package com.kn.Arrays;

import java.util.Scanner;

public class TwoDJaddedArray {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of batchs");
//      array declaration and initialisation
      
      String arr[][]=new String[scan.nextInt()][];
      System.out.println("Enter the no of Friends for Each batch");
      
      
//      array initialisation
//       arr[0]=new String[scan.nextInt()];
//       arr[1]=new String[scan.nextInt()];
//       arr[2]=new String[scan.nextInt()];
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=new String[scan.nextInt()];
      }
     
        for(int i=0;i<arr.length;i++) {
    	   System.out.println("A"+(i+1)+" batch friends names");
    	 
    	   for(int j=0;j<arr[i].length;j++) {
   		   System.out.print("Friend "+(j+1)+" Name :");
    		   
    		   arr[i][j]=scan.next();
    		   
    	   }
       }
//      array Traversing
       System.out.println("Friends Names of all batchs");
       for(int i=0;i<arr.length;i++) {
    	   System.out.println("A"+(i+1)+" Batch friends Names");
    	   for(int j=0;j<arr[i].length;j++) {
    		   System.out.print("Friend "+(j+1)+" Name : ");
    		  
    		   System.out.println(arr[i][j]);
    	   }
       }
       scan.close(); 
	}

}

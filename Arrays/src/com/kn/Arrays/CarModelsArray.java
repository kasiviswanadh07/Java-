package com.kn.Arrays;

import java.util.Scanner;

public class CarModelsArray {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the Number of companies");
      
//      array declaration and creation
      String arr[][]=new String[scan.nextInt()][];
       
      System.out.println("Enter the No of Models in Each Company");
      for(int i=0;i<arr.length;i++) {
    	 arr[i]= new String[scan.nextInt()];
      }
//      array Initilisation
      for(int i=0;i<arr.length;i++) {
    	  
    	  System.out.println("Enter the Company Name " +(i+1)+":");
    	  String b=scan.next();
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.println("Enter the Model "+(j+1)+" Name of "+b+": company");
    		  arr[i][j]=scan.next();
    		  
    	  }
      }
//     array Traversing
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("company Name : " );
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.print("Model Name : ");
    		  System.out.println(arr[i][j]);
    	  }
      }scan.close();
      
      
	}

}

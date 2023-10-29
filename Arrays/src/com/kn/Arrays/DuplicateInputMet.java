package com.kn.Arrays;

import java.util.Scanner;

public class DuplicateInputMet {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the Size of an array");
      
//      array creation and declaration
      int arr[]=new int[scan.nextInt()];
      
      System.out.println("Enter the values of an array");
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=scan.nextInt();
      }
     int k=0;
      for(int i=0;i<arr.length;i++) {
    	  for(int j=1;j<arr.length;j++) {
    		 if(arr[i]==arr[j]) {
    			 k=j;
    		  break;
    		 }
    		  
    		  
    	  }
      }System.out.println(arr[k]);
	}
}
	



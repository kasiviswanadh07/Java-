package com.kn.Arrays;

import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
      Scanner scan =new Scanner(System.in);
      System.out.println("Enter the size of an array");
     
      int arr[]=new int[scan.nextInt()];
      System.out.println("Enter the Data of an array");
      for(int i=0;i<arr.length;i++) {
      arr[i]=scan.nextInt();
      }
//      array traversing
     int max=0;
      for(int i=0;i<arr.length;i++) { 
		if(arr[i]>max) {  
    		  max=arr[i];
    	   }
      }
      int min=0;
       for(int i=arr.length-1;i<=0;i--) {
		  if(min<arr[i]&&min>=1) {	
			  
			  min=arr[i];		      
			  
		  } 
    	  }System.out.println("The maximum value of an array :"+max);
    	  System.out.println("The maximum value of an array :"+min);
    	  
      }
}
	
	
	
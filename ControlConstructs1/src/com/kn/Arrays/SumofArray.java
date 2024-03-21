package com.kn.Arrays;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  int arr[];
	  System.out.println("Enter the size");
	  arr =new int[scan.nextInt()];
	  System.out.println("Enter the data");
	  for(int i=0;i<arr.length;i++) {
		  
		  arr[i]=scan.nextInt();
	  }
	  
	  int sum = 0;
	  for(int i=0;i<arr.length;i++) {
		  
		  sum=sum+arr[i];
	  }
	  scan.close();
      System.out.println(sum);
	}

}

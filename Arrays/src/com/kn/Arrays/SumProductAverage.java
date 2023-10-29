package com.kn.Arrays;

import java.util.Scanner;

public class SumProductAverage {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the size of an array");
        
        
      int arr[]=new int[scan.nextInt()];
      System.out.println("Enter the numbers");
		for(int i=0;i<arr.length;i++) {
        	 arr[i]=scan.nextInt();
        }
		int sum=0,product=1; float average=0;
        for(int i=0;i<arr.length;i++) {
        	sum=sum+arr[i];
        	product=product*arr[i];
        	average=sum/arr.length;
        }System.out.println("The addition of an array is : "+sum);
        System.out.println("The product of an array is : "+product);
        System.out.println("The average of an given array is : "+average);
	}

}

package com.kn.Arrays;

import java.util.Scanner;

public class EvenArray {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int[] arr;
       System.out.println("enter the range of array");
       arr =new int[scan.nextInt()];
       System.out.println("Enter the numbers");
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=scan.nextInt();
       }
       for(int i=0;i<=arr.length-1;i++) {
    	   if(arr[i]%2==0) {
    		   System.out.println(arr[i]+" is Even number");
    	   }
       }
       scan.close();
	}

}


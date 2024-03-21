package com.kn.Arrays;

import java.util.Scanner;

public class GivenNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[];
		System.out.println("Enter the range");
		arr=new int[scan.nextInt()];
		System.out.println("Enter the Data");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Enter the Number to check");
		 int check=scan.nextInt();
		int isfind=findcheck(arr,check);
		System.out.println("Given number is present :" +isfind+" times");
		}
		
		private static int findcheck(int[] arr, int check) {
			
        
           int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==check) {
			   count++;
			return count;
			
			}
		}	return count ;
	
	


	}

}

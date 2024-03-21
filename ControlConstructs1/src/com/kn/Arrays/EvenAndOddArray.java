package com.kn.Arrays;

import java.util.Scanner;

public class EvenAndOddArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[];
		System.out.println("Enter the range of an array");
		arr=new int [scan.nextInt()];
		System.out.println("Enter the numbers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" is Even Number");
			}else {
				System.err.println(arr[i]+" is Odd Number");
			}
		}
		scan.close();

	}

}

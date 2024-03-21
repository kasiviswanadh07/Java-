package com.dsa.Array;

import java.util.Scanner;

public class Array {
 
	private Scanner scan=new Scanner(System.in);
	private int arr[];
	public Array(int n) {
 
		arr=new int[n];
	}
	public void insertion() {
		System.out.println("Enter the position we want to insert in b/w 0 to "+(arr.length-1));
		int pos=scan.nextInt();
		System.out.println("Enter the element we want to insert");
		int elem=scan.nextInt();
		arr[pos]=elem;	
	}
	public void deletion() {
		System.out.println("Enter the position of element we want delete 0 to "+(arr.length-1));
		int pos=scan.nextInt();
		System.out.println("The "+pos+" position to be deleting");
		arr[pos]=0;	
	}
	public void display() {
		System.out.println("The data presented in the Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
		
	}	


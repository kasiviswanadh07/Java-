package com.dsa.CircularQueue;

import java.util.Scanner;

public class CircularQueue {

	private Scanner scan=new Scanner(System.in);
	private int cqrr[];
	private int r=-1;
   private	int f=0;
	private int size;
	private int count=0;
	
	public CircularQueue(int n) {
		cqrr=new int[n];
		size=cqrr.length;
	}
	public void insertion() {
		if(count==size) {
			System.out.println("Insertion Not Possible");
		}else {
		System.out.println("Enter the element to add");
		int elem=scan.nextInt();
		r=(r+1)%size;
		cqrr[r]=elem;
		count++;	
		}
	}
	public void deletion() {
		if(count==0) {
			System.out.println("Deletion Not Possible");
		}else {
			System.out.println("Element Deleted is "+cqrr[f]);
			f=(f+1)%size;
			count--;
		}
	}
	public void display() {
		if(count==0) {
			System.out.println("Display Not Possible");
		}else {
			int f1=f;
			for(int i=1;i<=count;i++) {
				System.out.print(cqrr[f1]+" ");
				f1=(f1+1)%size;
				
				
			}
		}
		System.out.println();
	}
	
}

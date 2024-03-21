package com.dsa.Queue;

import java.util.Scanner;

public class Queue {

	private int qrr[];
	private int r=-1;
	private int f=0;
	private int size;
	private Scanner scan=new Scanner(System.in);
	
	public Queue(int n) {
		qrr=new int[n];
		size=qrr.length;
	}
	public void insertion() {
		int elem;
		if(r==size-1) {
			System.out.println("Insertion not possible");
		}else {
			System.out.println("Enter the element to add");
			elem=scan.nextInt();
			r++;
			qrr[r]=elem;
			
		}
	}
	public void deletion() {
		if(r==-1 || f>r) {
			System.out.println("Deletion not possible");
		}else {
			System.out.println("Deleted element "+qrr[r]);
			f++;
		}
	}
	public void display() {
		if(r==-1 || f>r) {
			System.out.println("Display not possible");
		}else {
			for(int i=f;i<=r;i++) {
				System.out.print(qrr[i]+" ");
		}
	}
	
}
}
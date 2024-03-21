package com.dsa.Stack;

import java.util.Scanner;

public class Stack {
   private int srr[];
   private int top=-1;
   private int size;
   Scanner scan=new Scanner(System.in);
   public Stack(int n) {
	   srr=new int[n];
	   size=srr.length;
   }
   public void push() {
	   int elem;
	   if(top==size-1) {
		   System.out.println("Push not possible");
	   }else {
		  System.out.println("Enter the element to add");
		  elem=scan.nextInt();
		  top++;
		  srr[top]=elem;
	   }
   }
   public void pop() {
	   if(top==-1) {
		   System.out.println("Pop not possible");
	   }else {
		   System.out.println("The element to be deleted "+srr[top]);
		   --top;
	   }
   }public void display() {
	   if(top==-1) {
		   System.out.println("Display not possible");
	   }else {
		   for(int i=top;i>=0;i--) {
			   System.out.print(srr[i]);
		   }
	   }System.out.println();
   }
   
}

package com.in.arrays;

import java.util.Scanner;

public class ArrayTraversingDemo {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int arr[]=new int[scan.nextInt()];
      
//      array initialisation
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("Enter the Array elemenys "+(i+1));
    	  arr[i]=scan.nextInt();
    	  

      }
      
//      object creation
      ArrayTraversing arrayTraversing=new ArrayTraversing();
      arrayTraversing.printarrayelemnets(arr);
      scan.close();
	}

}

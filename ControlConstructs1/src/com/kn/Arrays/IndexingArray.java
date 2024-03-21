package com.kn.Arrays;

import java.util.Scanner;

public class IndexingArray {

	public static void main(String[] args) {
//      int arr[]=new int[5];
//       arr[0]=12;
//       arr[1]=15;
//       arr[2]=48;
//       arr[3]=65;
//       arr[4]=89;
//       System.out.println(arr[2]);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the values");
		for(int i=0;i<arr.length;i++) {
		  arr[i]=scan.nextInt();		  
	}
         int num=scan.nextInt();
        int b=arr[scan.nextInt()];
		  System.out.println("The index value "+num+" is "+ b);	
		  scan.close();
	}
	

}

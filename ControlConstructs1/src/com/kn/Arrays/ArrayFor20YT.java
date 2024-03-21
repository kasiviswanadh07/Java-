package com.kn.Arrays;

import java.util.Scanner;

public class ArrayFor20YT {

	public static void main(String[] args) {
      Scanner scan=new Scanner("Enter the Number in between0 and 20");
      int n=scan.nextInt();
      
      while(n>=0 || n<=20) {
    	  n=scan.nextInt();
      }
      int numbers[]=new int[n];
      fillanarray(numbers);
      
	}

	public static void fillanarray(int[] numbers) {
       	Scanner scan=new Scanner(System.in);
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=scan.nextInt();
	}

		
		
	}

}

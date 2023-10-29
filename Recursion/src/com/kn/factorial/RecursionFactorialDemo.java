package com.kn.factorial;

import java.util.Scanner;

public class RecursionFactorialDemo {

	public static void main(String[] args) {
//     Take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scan.nextInt();

//		object creation for RecursionFactorial
		RecursionFactorial factorial = new RecursionFactorial();

//		call Method to factorial 
		int result = factorial.findFactorial(input);

		System.out.println("Factorial of "+ input +" is:" + result);

//	    Release resource
		scan.close();

	}

}

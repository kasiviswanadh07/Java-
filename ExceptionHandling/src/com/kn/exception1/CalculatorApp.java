package com.kn.exception1;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
       System.out.println("Welcome to the calculator application");
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the first number");
       int a=scan.nextInt();
       System.out.println("Enter second number");
       int b=scan.nextInt();
       Multiply(a,b);
       System.out.println("Main () method ended");
   
       scan.close();
	}

	private static void Multiply(int a, int b) {
         System.out.println("Multiplication method started");
         int product=a*b;
         System.out.println("Product "+product);
         Divide(a,b);
         System.out.println("Multiplication method ended");
		
	}

	private static void Divide(int a, int b) {
        System.out.println("Division method started");
        double divide=0;
        try {
         divide=a/b;
        }catch(ArithmeticException ae) {
        	System.out.println("Exception Handled");
        }
        System.out.println("Division "+divide);
        System.out.println("Division method ended");
       
		
	} 

}

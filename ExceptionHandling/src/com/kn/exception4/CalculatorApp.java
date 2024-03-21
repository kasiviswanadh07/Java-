package com.kn.exception4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Program started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		
		int num1 = scan.nextInt();
		
		
		System.out.println("Enter the 2nd number");
		int num2 = scan.nextInt();

		System.out.println("Enter the operator to processed an operation");
		
		
		
        try {
        	char ope = scan.next().charAt(0);
		switch (ope) {
		case '+':
			addtion(num1, num2);
			break;
		case '-':
			subtraction(num1, num2);
			break;
		case '*':
			try {
				multiplication(num1, num2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case '/':
			division(num1, num2);
			break;
			default:
				System.out.println("Invalid Enter");
		}
		System.out.println("operator "+ope);
		System.out.println("Exception handled");
        }catch(InputMismatchException ime) {
            System.out.println("InputMismatchException Ended");
        }
        System.out.println("Program executed successfully");
		scan.close();
	}
	

	private static void division(int num1, int num2) {
		System.out.println("Division Started");
		int division = 0;
		try {
			division = num1 / num2;
			System.out.println("Division " + division);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic exception handled");
		}
		System.out.println("Division ended");
	}

	private static void multiplication(int num1, int num2) throws Exception {
		System.out.println("Multiplication started");
		int multi = 0;
		try {
			multi = num1 * num2;
			System.out.println("Multiplication " + multi);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic exception handled");
		}
		System.out.println("Multiplication ended");
	}

	private static void subtraction(int num1, int num2) {
		System.out.println("subtraction method has started");
		int sub = 0;
		try {
			sub = num1 - num2;
			System.out.println("Subtration " + sub);
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException is handled");
		}
		System.out.println("subtraction ended");
	}

	private static void addtion(int num1, int num2) {
		System.out.println("addition method has started");
		System.out.println(num1 + num2);
		System.out.println("addtion method had been ended");
	}
     
}

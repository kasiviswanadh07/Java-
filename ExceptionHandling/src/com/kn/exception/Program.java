package com.kn.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Programm Started");
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter size of the Array = ");
			int[] arr = new int[scan.nextInt()];

			System.out.println("Enter the Index value");
			int index = scan.nextInt();
			System.out.println("Enter the element to be placed at " + index);
			int element = scan.nextInt();

			System.out.println("Enter the numerator= ");
			int numerator = scan.nextInt();
			System.out.println("Enter the denominator");
			int denominator = scan.nextInt();

			double division = numerator / denominator;
			System.out.println("Division " + division);
		} catch (InputMismatchException ime) {
			System.out.println("Enter appropriate data");
			ime.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println("Denominator must be greater than zero");
			ae.printStackTrace();
		} catch (NegativeArraySizeException nase) {
			System.out.println("Array size must be positve value");
			nase.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		} finally {
			System.out.println("Final block executed for sure");
			scan.close();
		}

		System.out.println("Program execution completed sucessfully");

	}

}

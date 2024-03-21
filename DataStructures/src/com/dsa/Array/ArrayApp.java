package com.dsa.Array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = scan.nextInt();

		Array a = new Array(n);

		while (true) {
			System.out.println("Enter 1 for insertion element into array");
			System.out.println("Enter 2 for deletion of elment in the array");
			System.out.println("Enter 3 for display the elements in the array");
			System.out.println("Press any other number to exit");
			System.out.println("Choose one choice from the above");

			int key = scan.nextInt();
			switch (key) {
			case 1:
				a.insertion();
				break;
			case 2:
				a.deletion();
				break;
			case 3:
				a.display();
				break;

			default:
				System.out.println("---------->>>Execution completed<<<-------------");
				System.exit(key);
			}

		}

	}

}

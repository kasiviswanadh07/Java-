package com.kn.IfElse;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean isMultiple = Multiple(num);
		if (isMultiple == true) {
			System.out.println("Multiple of 5");
		} else {
			System.out.println("Not a multiple of 5");
		}
		scan.close();
	}

	static boolean Multiple(int num) {
		if (num % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
/*Enter the number
20
Multiple of 5
Enter the number
23
Not a multiple of 5
*/
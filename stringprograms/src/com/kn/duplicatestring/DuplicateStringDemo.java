package com.kn.duplicatestring;

import java.util.Scanner;

public class DuplicateStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scan.nextLine();

//	      create a method for Duplicate
		DuplicateStringApp change = new DuplicateStringApp();
		System.out.println(change.isDuplicate(input));
		scan.close();

	}

}

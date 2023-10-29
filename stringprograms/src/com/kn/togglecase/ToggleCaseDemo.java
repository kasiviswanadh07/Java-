package com.kn.togglecase;

import java.util.Scanner;

public class ToggleCaseDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scan.nextLine();

//	      create a method for reverseword
		ToggleCaseApp change = new ToggleCaseApp();
		 System.out.println(change.ischange(input));
		 scan.close();

	}

}

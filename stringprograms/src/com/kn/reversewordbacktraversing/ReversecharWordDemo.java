package com.kn.reversewordbacktraversing;

import java.util.Scanner;

public class ReversecharWordDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scan.nextLine();

//	      create a method for reverseword
		ReversewordApp word = new ReversewordApp();
		 word.reverseWord(input);

		
	}

}

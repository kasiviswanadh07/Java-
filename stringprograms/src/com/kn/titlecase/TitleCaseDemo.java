package com.kn.titlecase;

import java.util.Scanner;

public class TitleCaseDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString = scan.nextLine();

//	      create a method for reverseword
		TitleCaseApp change = new TitleCaseApp();
		 System.out.println(change.ischange(inputString));
		 scan.close();
		
		
		
		
	}

}

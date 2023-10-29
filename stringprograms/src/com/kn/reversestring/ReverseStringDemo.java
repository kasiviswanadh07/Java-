package com.kn.reversestring;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
//       Take inputs string from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String inputstring = scan.nextLine();

//		create a object of the class Reverse string
		Reversestring reverseString = new Reversestring();
		
//		call method to Reverse string
		String outputstring = reverseString.reverseString(inputstring);
		System.out.println(outputstring);
		
//		Release the resource
		scan.close();
	}

}

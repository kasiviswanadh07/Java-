package com.kn.palindrome;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
//      Take input string from user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");		
		String inputString=scan.nextLine();
		  
//		create a an object of the class ispalindrom
		Plaindrome isPalindrom=new Plaindrome();
//		call the method to check the palindrom
		String outputString=isPalindrom.isPalindrom(inputString);
		System.out.println(outputString);
		
//		Release the resource
		scan.close();
		
		
		
		
		
		
		
	}

}

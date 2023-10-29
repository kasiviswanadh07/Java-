package com.kn.romannumbers;

import java.util.Scanner;

public class RomanNumbersDemo {

	public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    
    System.out.println("Enter the string");
   int inputNum=scan.nextInt();
    
		RomanNumbersApp RomanNumber=new RomanNumbersApp();
		String result=RomanNumber.isRomanNumber(inputNum);
		System.out.println(result);
		scan.close();
	}

}

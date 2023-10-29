package com.kn.invalidandvalidstring;

import java.util.Scanner;

public class ValidAndInvalidStringDemo {

	public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter the input string");
    
    String inputString=scan.nextLine();
    
    ValidAndInvalidStringApp validOrInvalidString=new ValidAndInvalidStringApp();
    boolean result=validOrInvalidString.validOrInvalid(inputString);
		
		if(result==true) {
			System.out.println("Valid String");
		}else {
			System.out.println("Invalid String");
		}
		
		
		
		
		
	}
}

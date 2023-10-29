package com.kn.longestword;

import java.util.Scanner;

public class LongestWordDemo {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the string");
      String input=scan.nextLine();
      
//      create a method for Longestword
      LongestWordApp word=new LongestWordApp();
      String output=word.FindLongestWordApp(input);
      
      System.out.println(output);
      
      
		
		
		
		
	}

}

package com.kn.countchar;

import java.util.Scanner;

public class CountCharcter {

	public static void main(String[] args) {
//		Take a input string from  the user 
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the String");
    String s1=scan.nextLine();
    
    System.out.println("Enter the charcter to count");
    char ch=scan.next().charAt(0);
    
//   creating object for countcharcter 
   CountCharcterApp charcter=new CountCharcterApp();
		int count=charcter.countcharcter(s1, ch);
		System.out.println(count);
//	  
		
	}

}

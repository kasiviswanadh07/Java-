package com.kn.anagramstring;

import java.util.Scanner;

public class AnagramStringDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scan.nextLine();
		System.out.println("Enter the string");
		String s2=scan.nextLine();
		
		AnagramStringApp anagramString=new AnagramStringApp();
		
		boolean isanagram=anagramString.isanagram(s1,s2);
		if(isanagram) {
			System.out.println(s1+"&&"+s2+" are Anagram Strings");
		}else {
			System.out.println(s1+"&&"+s2+" are not Anagram Strings");
			
		}
		
		
	}
}

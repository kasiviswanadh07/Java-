package com.kn.ElseIfLadder;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		System.out.println("Enter a integer");
		Scanner scan=new Scanner(System.in);
		int integer=scan.nextInt();
		String isinteger=Assignment(integer);
		if(isinteger=="a") {
			System.out.println("Negative");
		}else if(isinteger=="b") {
			System.out.println("Positive");
		}else {
			System.out.println("Zero");
		}
		scan.close();
	}

	static String Assignment(int integer) {
		if(integer<0) {
			return "a";
		}else if(integer>0) {
			return "b";
		}else
		return "c" ;
	}

}

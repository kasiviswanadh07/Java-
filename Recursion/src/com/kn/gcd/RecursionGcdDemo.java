package com.kn.gcd;

import java.util.Scanner;

public class RecursionGcdDemo {

	public static void main(String[] args) {
//		Take input from user
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
//		object creation for RecursionGcd
		RecursionGcd gcd=new RecursionGcd();
		
//		Call method to gcd
		int result =gcd.findGcd(num1,num2);
		System.out.println(result);
		
//		Release resource
		scan.close();
		
		
	}

}

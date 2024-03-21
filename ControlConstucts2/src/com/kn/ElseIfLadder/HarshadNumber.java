package com.kn.ElseIfLadder;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number to check it is an Harshad Number or Not");
		int num = scan.nextInt();
		boolean isharshad = isHarshad(num);
		if (isharshad == true) {
			System.out.println("Enter Number " + num + " is an Harshad number");
		}else {
			System.out.println("Enter Number "+ num+" is Not an Harshad Number");
		}
 
		scan.close();
	}

	private static boolean isHarshad(int num) {
		int sum = 0;
		int temp=num;
		while (num != 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println(sum);
		System.out.println(temp);
		if (temp % sum == 0) {
			return true;
		}
		return false;
	}

}

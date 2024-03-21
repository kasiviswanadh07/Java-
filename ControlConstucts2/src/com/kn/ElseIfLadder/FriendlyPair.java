package com.kn.ElseIfLadder;

import java.util.Scanner;

public class FriendlyPair {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number to check friendly pair or not");
		int num1=scan.nextInt();
		System.out.println("Enter the second number to check friendly pair or not");
		int num2=scan.nextInt();
		
		boolean isFriendly=isFriendlyPair(num1,num2);
		if(isFriendly==true) {
			System.out.println("Enter Numbers "+num1+" && "+num2+" are Friendly Pair Numbers");
		}else {
			System.out.println("Enter Numbers "+num1+" && "+num2+" are not a Friendly Pair Numbers");
		}
	}

	private static boolean isFriendlyPair(int num1, int num2) {

		int sum1=0;
		int sum2=0;
		for(int i=1;i<=num1;i++) {
			if(num1%i==0) {
				 sum1=sum1+i;
			}
		}
		for(int i=1;i<=num2;i++) {
			if(num2%i==0) {
				sum2=sum2+i;
			}
		}
		if(sum1/num1==sum2/num2) {
			return true;
		}
		
		return false;
	}

}

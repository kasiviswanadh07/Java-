package com.kn.ElseIfLadder;

import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number to check it is abundant Number or Not");
		int num=scan.nextInt();
		boolean isabundant=isAbundant(num);
		if(isabundant==true) {
			System.out.println("Enter Number "+num+" is an AbundantNumber");
		}
		else {
			System.out.println("Enter Number "+num+" is not an AbundantNumber");
		}
		scan.close();
	}

	private static boolean isAbundant(int num) {
		
		int fact=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				fact=fact+i;
			}
			if(fact>num) {
				return true;
			}
		}
		return false;
	}

}

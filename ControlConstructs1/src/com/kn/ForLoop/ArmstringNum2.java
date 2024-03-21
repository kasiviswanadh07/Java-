package com.kn.ForLoop;

import java.util.Scanner;

public class ArmstringNum2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to check");
		int num=scan.nextInt();
		
		int pow=count(num);
	     int sum=isArm(num,pow);
	     System.out.println(sum);

		
	}

	private static int isArm(int num, int pow) {

		int digit;
		int sum = 0;
		if(num==0) {
			return 0;
		}
		while(num>0) {
			digit=num%10;
			sum=(int) (sum+Math.pow(digit,pow));
			num=num/10;
			
		}
		return sum;
		
	}

	private static int count(int num) {
		int digit=0;
		int count=0;
		while(num>0) {
			digit=num%3;
			count++;
			num=num/10;
		}
			return count;
	}

}

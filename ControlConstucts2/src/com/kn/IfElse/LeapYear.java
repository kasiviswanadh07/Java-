package com.kn.IfElse;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		boolean isleapyear=Discount(year);
		if(isleapyear==true) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Non-Leap Year");
		}
		scan.close();

	}

     static boolean Discount(int year) {
    	if(year%4 == 0 && year % 100 != 0 || year % 400 == 0) {
    		return true;
    	}
//		if(year%4==0) {
//		return true;
//		}else if(year%400==0) {
//			return true;
//		}else if(year%100!=0) {
//			return true;
//		}
		else {
			return false;
		}

	}

}

/*Enter the year
2028
Leap Year
Enter the year
2021
Non-Leap Year
*/

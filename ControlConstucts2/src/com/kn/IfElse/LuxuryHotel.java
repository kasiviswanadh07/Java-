package com.kn.IfElse;

import java.util.Scanner;

public class LuxuryHotel {

	public static void main(String[] args) {
		System.out.println("Enter the age of a person");
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		boolean charges=Discount(age);
		if(charges==true) {
			System.out.println("Senior Citizen Charges Applicable");
		}else {
			System.out.println("Regular Charges Applicable");
		}
		scan.close();

	}

     static boolean Discount(int age) {
		if(age>=60) {
		return true;
		}
		else {
			return false;
		}

	}
}
     
   /*Enter the age of a person
65
Senior Citizen Charges Applicable
Enter the age of a person
45
Regular Charges Applicable
*/






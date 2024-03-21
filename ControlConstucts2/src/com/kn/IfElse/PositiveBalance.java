package com.kn.IfElse;

import java.util.Scanner;

public class PositiveBalance {

	public static void main(String[] args) {
		System.out.println("Enter balance amount");
		Scanner scan=new Scanner(System.in);
		int balance=scan.nextInt();
		boolean amount=Amount(balance);
		if(amount==true) {
			System.out.println("Negative Balance");
		}else {
			System.out.println("Positive Balance");
		}
		scan.close();

	}

     static boolean Amount(int balance) {
		if(balance<0)
		return true;
		else {
			return false;
		}

	}

}
/*Enter balance amount
500
Positive Balance
Enter balance amount
-200
Negative Balance
*/

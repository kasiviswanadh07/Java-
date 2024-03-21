package com.kn.IfElse;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		System.out.println("Enter a marks");
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		boolean marks=Grades(score);
		if(marks==true) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		scan.close();

	}

     static boolean Grades(int score) {
		if(score>=60)
		return true;
		else {
			return false;
		}
	}

}

/*Enter a marks
75
Passed
Enter a marks
55
Failed
*/

package com.kn.ElseIfLadder;

import java.util.Scanner;

public class CommunityCenter {

	public static void main(String[] args) {
		System.out.println("Enter the age");
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		categorize(age);
		scan.close();

	}

	private static void categorize(int age) {
		if(age<=12) {
			System.out.println("Child");
		}else if(age>=13 && age<=19) {
			System.out.println("Teen");
		}else if(age>=20 && age<=59) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior Citizen");
		}
		
	}

}

/*Enter the age
6
Child
Enter the age
30
Adult
*/
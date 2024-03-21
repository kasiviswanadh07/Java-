package com.kn.NestedIf;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		System.out.println("Age-");
		System.out.println("Eyesight-");
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		int eyesight=scan.nextInt();
		DrivingLIcense(age,eyesight);
		System.out.print("Age-"+age);
		System.out.println(", Eyesight-"+eyesight);
		

	}

	 static void DrivingLIcense(int age, int eyesight) {
		if(age>=18 && eyesight>=6) {
			System.out.println("Driving License Eligible");
		}
		
	}

}
/*Age-
Eyesight-
20
7
Driving License Eligible
Age-20, Eyesight-7
Age-
Eyesight-
20
5
Age-20, Eyesight-5
*/
package com.kn.exception5;

import java.util.Scanner;

public class LicenceApp {

	public static void main(String[] args) {
       System.out.println("Licence Application started");
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the Age");
       int age=scan.nextInt();
       
       try {
		licenceApplication(age);
		System.out.println("Age "+age);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Exception was handled");
	}
		
	}

	private static void licenceApplication(int age) throws Exception {
		 
		System.out.println("Licence application would move to next process");
		if(age>=18 && age<=65) {
			System.out.println("You are eligible for voting");
		}else if(age<18 ) {
			System.out.println("You are too young for licence");
		}else if(age<65) {
			System.out.println("You are too old for licence");
		} throw new AgeFormat("Age should be in between 18 and 60");
	}

}

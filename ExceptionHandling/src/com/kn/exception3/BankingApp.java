package com.kn.exception3;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
       System.out.println("Banking Application Started");
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the amount to be withdraw");
       int amount=scan.nextInt();
       
       try {
		withdraw(amount);
	} catch (Exception e) {
		e.printStackTrace();
	}
	scan.close();	
	}

	private static void withdraw(int amount) throws InsufficientFunds{
        int accountBalance=15000;
        if(amount<=accountBalance) {
        	System.out.println("Tranction successful");
        }else {
        	System.out.println("insufficient balance");
        }
		throw new InsufficientFunds("Invalid entering");
		
	}

	
}

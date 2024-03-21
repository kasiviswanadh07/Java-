package com.kn.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {
    System.out.println("Welcome to the shopping App");
    shop();
    System.out.println("Main method ended");
		
	}

	private static void shop() {
      System.out.println("Shop method started");
      try{
    	  pay();
      }catch(InputMismatchException in){
    	  System.out.println("Pay method stopped due to inappropriate input");
      }
      System.out.println("shop method ended");
	}

	private static void pay() throws InputMismatchException {
//		thorws to the warning to the pay method caller 
      System.out.println("Pay method started");
      Scanner scan=null;
      System.out.println("Enter amount to be paid");
      try {
    	  scan=new Scanner(System.in);
    	  double amount=scan.nextDouble();
    	  System.out.println("Amount paid "+amount);
      }catch(InputMismatchException ime) {
    	  System.out.println("Exception handled");
    	  throw ime; //re-throwing exception
      }
      scan.close();
      System.out.println("pay method ended");
	}

}

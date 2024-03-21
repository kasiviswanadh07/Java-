package com.kn.exception3;

public class InsufficientFunds extends Exception{

	public InsufficientFunds() {
		super();
	}

	public InsufficientFunds(String message) {
		super(message);
		System.out.println("Enter amount should be less than or equal to the account balance");
	}
}

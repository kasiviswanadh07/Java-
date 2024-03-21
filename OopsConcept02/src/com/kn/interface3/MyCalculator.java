package com.kn.interface3;

public class MyCalculator implements Calculator1{

	@Override
	public void addition() {
		System.out.println("Addition");
	}

	@Override
	public void multiplication() {
		System.out.println("Multiplication");
	}

	@Override
	public void subtraction() {
		System.out.println("Subtraction");
	}

	@Override
	public void division() {
		System.out.println("Division");
	}
   
	
}

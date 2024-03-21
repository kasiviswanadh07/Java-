package com.kn.polymorphism;

public class Upi extends Payment {

	@Override
	public void pay() {
       System.out.println("Paid via UPI");
	}
}

package com.kn.polymorphism;

public class Wallet extends Payment {

	@Override
	public void pay() {
      System.out.println("Paid via Wallet");
	}
    
}

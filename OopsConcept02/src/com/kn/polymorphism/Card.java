package com.kn.polymorphism;

public class Card extends Payment {

	@Override
	public void pay() {
		System.out.println("Piad via Card");
	}
}

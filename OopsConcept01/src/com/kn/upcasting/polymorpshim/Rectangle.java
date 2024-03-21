package com.kn.upcasting.polymorpshim;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}

	@Override
	public double CalculateArea() {
		double l=10.5,b=5.5;
		return l*b;
	}

}

package com.kn.upcasting.polymorpshim;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public double CalculateArea() {
		double r=2.5;
		return Math.PI*r*r;
		
	}

}

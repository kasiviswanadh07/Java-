package com.kn.upcasting.polymorpshim;

public class Square extends Shape{

	@Override
	public void draw() {
	   System.out.println("Drawing Square");
	}

	@Override
	public double CalculateArea() {
		double side=2.5;
		return side*side;
		
	}

}

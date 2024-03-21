package com.kn.downcasting.polymorphism;

public class Circle extends Shape {
 
	double radius=2.5;
	@Override
	public double CalculateArea() {
		return Math.PI *radius*radius;	
	}
    public  double Perimeter() {
		return 2*Math.PI*radius;
		
	}
}

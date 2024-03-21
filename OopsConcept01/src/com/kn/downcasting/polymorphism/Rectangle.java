package com.kn.downcasting.polymorphism;

public class Rectangle extends Shape {
     double length=2.5,breadth=4.5;
	@Override
	public double CalculateArea() {
		return length*breadth;	
	}
	public double Perimeter() {
		return 2*length*breadth;
	}
      
	
}

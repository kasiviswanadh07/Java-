package com.kn.downcasting.polymorphism;

public class Square extends Shape {
      double side=5;
	@Override
	public double CalculateArea() {
		return side*side;		
	}
	public double Perimeter() {
		return 4*side;
		
	}
    
}

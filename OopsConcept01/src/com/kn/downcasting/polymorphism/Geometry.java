package com.kn.downcasting.polymorphism;

public class Geometry {
	public void doActivity(Shape sh) {
		sh.draw();
		System.out.println("Area: " + sh.CalculateArea());

		if (sh instanceof Rectangle) {
			System.out.println("Perimeter: "+((Rectangle) sh).Perimeter());
			
		}else if(sh instanceof Circle) {
			System.out.println("Perimeter: "+((Circle)sh).Perimeter());
			System.out.println();
		}else {
			System.out.println("Perimeter: "+((Square)sh).Perimeter());
		}
	}

}

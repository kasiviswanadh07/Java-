package com.kn.upcasting.polymorpshim;

public class Geometry {
	public void doActivity(Shape sh) {
       sh.draw();
       System.out.println("Area"+sh.CalculateArea());
	}
}

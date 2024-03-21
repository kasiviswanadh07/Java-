package com.kn.downcasting.polymorphism;

public class ShapeDownCastingDemo {

	public static void main(String[] args) {
      
		Shape sh=new Shape();
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		
		Geometry g=new Geometry();
		
		g.doActivity(s);
		System.out.println();
		g.doActivity(r);
		System.out.println();
		g.doActivity(c);
		
		
	}

}

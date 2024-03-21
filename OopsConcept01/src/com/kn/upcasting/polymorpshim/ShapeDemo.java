package com.kn.upcasting.polymorpshim;

public class ShapeDemo {

	public static void main(String[] args) {
//		Pass-By Reference
       Rectangle r=new Rectangle();
       Square s=new Square();
       Circle c=new Circle();
       
       Geometry g=new Geometry();
       
       g.doActivity(r);
       System.out.println();
       g.doActivity(s);
       System.out.println();
       g.doActivity(c);

//		Up-Casting
//		Rectangle rh = new Rectangle();
//		Shape s = new Shape();
//		s = rh;
//		s.draw();
//		System.out.println("Area: " + s.CalculateArea());
//
//		System.out.println();
//		Circle c=new Circle();
//		s=c;
//		s.draw();
//		System.out.println("Area: "+s.CalculateArea());
//		
//		System.out.println();
//		Square sh=new Square();
//		s=sh;
//		s.draw();
//		System.out.println("Area: "+s.CalculateArea());	
	}

}

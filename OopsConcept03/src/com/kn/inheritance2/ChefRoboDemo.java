package com.kn.inheritance2;

public class ChefRoboDemo {

	public static void main(String[] args) {

		ChefRobo cr=new ChefRobo();
		
		cr.name=" Kishore";
		
		System.out.println("Chef Name: "+cr.name);
		System.out.println("Chef Type: "+cr.type);
		
		cr.charging();
		cr.cook();
		cr.hobby();
		cr.talking();
		
		DriverRobo dr=new DriverRobo();
		
		dr.name=" Ajay";
		
		System.out.println();
		System.out.println();
		System.out.println("Chef Name: "+cr.name);
		System.out.println("Chef Type: "+cr.type);
		
		dr.charging();
		dr.drive();
		dr.hobby();
		dr.talking();
		
		TeachRobo t1=new TeachRobo();
		
		t1.name=" Arun";
		
		System.out.println();
		System.out.println();
		System.out.println("Chef Name: "+t1.name);
		System.out.println("Chef Type: "+t1.type);
		
		t1.hobby();
		t1.charging();
		t1.teach();
		t1.talking();
		
		
		
		
		
	}

}

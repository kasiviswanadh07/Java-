package com.kn.interface1;

public class Main implements Dessert, MainCourse,Starter{

	@Override
	public void Manchurian() {
  System.out.println("Gobbi Manchurian");		
	}

	@Override
	public void briyani() {
System.out.println("Mashoroom Briyani");		
	}

	@Override
	public void enjoy() {
System.out.println("Enjoy the meal");		
	}

	@Override
	public void GulabJaman() {
System.out.println("2 pieces of gulabjamn with ice cream");		
	}
     
}

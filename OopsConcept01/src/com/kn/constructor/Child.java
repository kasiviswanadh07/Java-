package com.kn.constructor;

public class Child extends Parent {
      String name;
      int age;
      
	public Child() {
		super();
		System.out.println("Child no-arg constructor");
	}

	public Child(String name, int age) {
		this();
		System.out.println("<<<<<<<Before>>>>>>>");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("Child 2-arg constuctor");
		this.name = name;
		this.age = age;
		
		System.out.println("<<<<<<<<After>>>>>>>>");
		System.out.println(name);
		System.out.println(age);
	}
	
	}


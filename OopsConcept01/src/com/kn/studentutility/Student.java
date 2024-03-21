package com.kn.studentutility;


public class Student {
	int id;
	String name;
	int marks;

	public Student(int id, String name, int marks) {
		
		this.id = id;
		this.name = name;
		if(marks >= 0 && marks <= 100) {
		this.marks = marks;
		}
	}	
}

package com.collections.TreeMap;

public class Student {

	int id;
	String name;
	Double cgpa;
	public Student(int id, String name, Double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
	
}

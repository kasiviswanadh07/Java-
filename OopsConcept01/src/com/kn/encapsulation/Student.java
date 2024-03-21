package com.kn.encapsulation;

public class Student {
	private int rollNumber;
	private String name;
	private int marks;
	private String gender;
	
	public int getRollNumber() {
		return rollNumber;		
	}
	public int getMarks() {
		return marks;		
	}
	public String getName() {
		return name;		
	}
	public String getGender() {
		return gender;		
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(int rollNumber, String name, int marks, String gender) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}
	  
}

package com.kn.encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
      Student s1=new Student(1452,"Anand",60,"Male");
      System.out.println("RollNumber = "+s1.getRollNumber());
      System.out.println("Name = "+s1.getName());
      System.out.println("Marks = "+s1.getMarks());
      System.out.println("RollNumber = "+s1.getGender());
	 
      s1.setRollNumber(123);
      s1.setName("kasi");
      s1.setMarks(50);
      s1.setGender("male");
      
      System.out.println("RollNumber = "+s1.getRollNumber());
      System.out.println("Name = "+s1.getName());
      System.out.println("Marks = "+s1.getMarks());
      System.out.println("RollNumber = "+s1.getGender());
      
		
		
		
		
	}

}

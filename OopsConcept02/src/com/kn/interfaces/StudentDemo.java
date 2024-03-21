package com.kn.interfaces;

public class StudentDemo {

	public static void main(String[] args) {
        CSEstudent cs1=new CSEstudent();
        MechStudent me1=new MechStudent();
        StudentDemo.callMethods(cs1);
        callMethods(me1);
        System.out.println(Student.id);
        
	}
      public static void callMethods(Student s) {
    	  s.study();
    	  s.doproject();
      }
	
}

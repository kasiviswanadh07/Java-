package com.in.arrays;

import java.util.Scanner;

public class EmployeeAgeAndName {

	 String name;
	 int age;

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the number of employees");
      EmployeeAgeAndName []emp=new  EmployeeAgeAndName[scan.nextInt()];
	  
		for(int i=0;i<emp.length;i++) {
			emp[i]=new  EmployeeAgeAndName();
		}
//		Array initialisation
		System.out.println("Enter the name and age of employee");
		for(int i=0;i<emp.length;i++) {
			emp[i].name=scan.next();
			emp[i].age=scan.nextInt();
		}
//		Array traversing
		for(int i=0;i<emp.length;i++) {			
			
		   System.out.println("Employee"+(i+1)+":");
		   System.out.println("Name:"+emp[i].name);
		   System.out.println("Age:"+emp[i].age);
		   
		   scan.close();
		}
	}

}

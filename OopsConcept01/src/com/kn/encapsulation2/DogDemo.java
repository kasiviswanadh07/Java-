package com.kn.encapsulation2;

import java.util.Scanner;

public class DogDemo {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the dog details name,age and gender");
    Dog d1=new Dog(scan.nextLine(),scan.nextInt(),scan.next());
    System.out.println("<<<<<<<Before Modification>>>>>>>");
    System.out.println("DogName= "+d1.name);
    System.out.println("DogAge= "+d1.age);
    System.out.println("DogGender= "+d1.gender);
		
    System.out.println("Enter the details of dog you want to change");
    
    d1.setName(scan.next());
    d1.setAge(scan.nextInt());
    d1.setGender(scan.next());
		
    System.out.println("<<<<<<<After Modification>>>>>>>");
    System.out.println("DogName= "+d1.name);
    System.out.println("DogAge= "+d1.age);
    System.out.println("DogGender= "+d1.gender);
	}

}

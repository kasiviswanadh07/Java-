package com.kn.inheritance.multilevel;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
      Vehical v1=new Vehical();
     v1.registrationNumber="Ap1236";
     System.out.println("RegistrationNumber: "+v1.registrationNumber);
     v1.move();
     
     Car c1=new Car();
     c1.registrationNumber="Ap165466";
     System.out.println("RegistrationNumber: "+c1.registrationNumber);
     c1.move();
     
    Sedan s1=new Sedan();
     s1.registrationNumber="Ap14566";
     System.out.println("RegistrationNumber: "+s1.registrationNumber);
     s1.move();
		
		
	}

}

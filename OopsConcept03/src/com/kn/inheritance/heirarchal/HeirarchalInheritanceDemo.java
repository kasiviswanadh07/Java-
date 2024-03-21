package com.kn.inheritance.heirarchal;

public class HeirarchalInheritanceDemo {

	public static void main(String[] args) {				
		Employee e1=new Employee();
		e1.name="Kasi";
		e1.salary=123;
		System.out.println("Name: "+e1.name+"- "+"Salary: "+e1.salary);
		
		Developer d1=new Developer();
		d1.name="Kishore";
		d1.salary=456;
		System.out.println("Name: "+d1.name+"- "+"Salary: "+d1.salary);
		
		TestEngineer te1=new TestEngineer();
		te1.name="Yogi";
		te1.salary=789;
		System.out.println("Name: "+te1.name+"- "+"Salary: "+te1.salary);
		
		Manager m1=new Manager();
		m1.name="Divakar";
		m1.salary=321;
		System.out.println("Name: "+m1.name+"- "+"Salary: "+m1.salary);
		
		Employee t1=new Employee();
		t1.name="Mani";
		t1.salary=654;
		System.out.println("Name: "+t1.name+"- "+"Salary: "+t1.salary);
		
		
		
	}

}

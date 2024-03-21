package com.hibernate.mySqlCon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Employee emp1=new Employee(1,"anand",16545);
		Employee emp2=new Employee(2,"kasi",116546);
		Employee emp3=new Employee(3,"viswanadh",1516546);
		
		Department dep1=new Department(1,"sales");
		Department dep2=new Department(2,"Business associate");
		Department dep3=new Department(3,"Developer");
		
		
		

//		1.Configure the hibernate.cfg.xml
		Configuration conf=new Configuration();
		conf.configure();
//		2.BUild a session factory using configuration
		SessionFactory factory=conf.buildSessionFactory();
//		3.open session factory
		Session session=factory.openSession();
//		4.Begin Transaction
		Transaction tnx=session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		session.save(dep1);
		session.save(dep2);
		session.save(dep3);
		
		tnx.commit();
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		
		System.out.println(dep1);
		System.out.println(dep2);
		System.out.println(dep3);
		
		
		
	}

}

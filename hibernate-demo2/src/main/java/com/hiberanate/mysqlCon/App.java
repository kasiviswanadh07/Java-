package com.hiberanate.mysqlCon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {

//		Bike b=new Bike(1,"Pulsar",150000);
//		Bike b1=new Bike(2,"Pusalr250",25000);
//		Bike b2=new Bike(3,"Fz",250000);
		
		Bike b1=new Bike (111);
		Bike b2=new Bike(222);
		Bike b3=new Bike(333);
		
		
		
		Student s=new Student(1,"Anand",89,b2);
		Student s1=new Student(2,"kasi",90,b3);
		Student s2=new Student(3,"Viswanadh",85,b1);
		
		
		b1.setModel("pulsar");
		b1.setCost(150000);
		b1.setid(s2);
		
		b2.setModel("pulsar 220");
		b2.setCost(16541151);
		b2.setid(s);
		
		
        b3.setModel("fz");
        b3.setCost(516541);
        b3.setid(s1);
		

		
//		1.Configure the hibernate.cfg.xml
		Configuration conf=new Configuration();
		conf.configure();
//		2.BUild a session factory using configuration
		SessionFactory factory=conf.buildSessionFactory();
//		3.open session factory
		Session session=factory.openSession();
//		4.Begin Transaction
		Transaction tnx=session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		
		session.save(s);
		session.save(s1);
		session.save(s2);
		
		tnx.commit();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		
	}

}

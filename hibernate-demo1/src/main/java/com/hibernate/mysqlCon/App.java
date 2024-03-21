package com.hibernate.mysqlCon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {

		Student s1=new Student(1,"viswanadh",90);
		Student s2=new Student(2,"anand",90);
		
//		1.configure the hibernate.cfg.xml
		Configuration cfg=new Configuration();
		cfg.configure();
//		2.Build SessionFactory using configuration
		SessionFactory factory=cfg.buildSessionFactory();
//		3.Open ssessionFactory
		Session session=factory.openSession();
//		4.Begin Transaction
		Transaction txn=session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		
//		5.Commit the Transaction
		txn.commit();
		System.out.println("---->" +s2+ " has been stored in database");
	}

}

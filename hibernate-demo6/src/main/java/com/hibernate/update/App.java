package com.hibernate.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

//		create();
//		read();
//		update();
		delete();
	}

	private static void delete() {

		Configuration conf=new Configuration().configure();
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		Laptop laptop=session.get(Laptop.class, 14);
		System.out.println("-----read--"+laptop);
		session.delete(laptop);
		txn.commit();
		System.out.println("Deleted successful");
	}

	private static void read() {

		Configuration conf=new Configuration().configure();
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		session.get(Laptop.class, 12);
		txn.commit();
	}

	public static void update() {

		Configuration conf=new Configuration().configure();
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		Laptop laptop =session.get(Laptop.class, 12);
		laptop.setBrand("Lenovo");
		laptop.setCost(52200);
		session.save(laptop);
		txn.commit();
		System.out.println("Laptop fetched from database "+laptop);
		
	}

	private static void create() {

		Laptop laptop=new Laptop(11,"HP",50000);
		Laptop laptop1=new Laptop(12,"dell",51000);
		Laptop laptop2=new Laptop(13,"asus",52000);
		Configuration conf=new Configuration().configure();
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(laptop);
		session.save(laptop1);
		session.save(laptop2);
		txn.commit();
	}

}

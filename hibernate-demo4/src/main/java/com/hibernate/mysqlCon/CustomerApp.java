package com.hibernate.mysqlCon;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerApp {

	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();

		List<Product> list1 = new ArrayList();
		list1.add(p1);
		list1.add(p2);

		List<Product> list2 = new ArrayList();
		list2.add(p3);
		list2.add(p4);

		Customer c1 = new Customer(1, "anand", 23, list1);
		Customer c2 = new Customer(2, "kasi", 24, list2);

		p1.setProduct_Id(01);
		p1.setProduct_Name("Mouse");
		p1.setProduct_Cost(1500);
		p1.setCustomer(c1);

		p2.setProduct_Id(02);
		p2.setProduct_Name("Keyboard");
		p2.setProduct_Cost(1000);
		p2.setCustomer(c1);

		p3.setProduct_Id(03);
		p3.setProduct_Name("camera");
		p3.setProduct_Cost(1350000);
		p3.setCustomer(c2);

		p4.setProduct_Id(04);
		p4.setProduct_Name("tv");
		p4.setProduct_Cost(50000);
		p4.setCustomer(c2);

//		1.Configure the hibernate.cfg.xml
		Configuration conf = new Configuration();
		conf.configure();
//		2.BUild a session factory using configuration
		SessionFactory factory = conf.buildSessionFactory();
//		3.open session factory
		Session session = factory.openSession();
//		4.Begin Transaction
		Transaction tnx = session.beginTransaction();

		session.save(c1);
		session.save(c2);

		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);

		tnx.commit();
		System.out.println("---completed");
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
//		System.out.println(p4);
	}

}

package com.hibernate.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Technology t1 = new Technology();
		Technology t2 = new Technology();
		Technology t3 = new Technology();
		Technology t4 = new Technology();

		List<Technology> Technologies1 = new ArrayList<Technology>();
		Technologies1.add(t1);
		Technologies1.add(t3);
		Technologies1.add(t4);
		List<Technology> Technologies2 = new ArrayList<Technology>();
		Technologies1.add(t2);
		Technologies1.add(t3);
		List<Technology> Technologies3 = new ArrayList<Technology>();
		Technologies3.add(t1);
		Technologies3.add(t2);
		Technologies3.add(t3);
		List<Technology> Technologies4 = new ArrayList<Technology>();
		Technologies4.add(t3);
		Technologies4.add(t4);
		List<Technology> Technologies5 = new ArrayList<Technology>();
		Technologies5.add(t1);
		Technologies5.add(t2);
		Technologies5.add(t3);
		Technologies5.add(t4);

		Employee e1 = new Employee(1, "Anand", "B", Technologies1);
		Employee e2 = new Employee(2, "kasi", "A", Technologies2);
		Employee e3 = new Employee(3, "viswanadh", "C", Technologies3);
		Employee e4 = new Employee(4, "yogi", "A", Technologies4);
		Employee e5 = new Employee(5, "kishore", "B", Technologies5);
		
		List<Employee>employees1=new ArrayList<Employee>();
		employees1.add(e1);
		employees1.add(e3);
		employees1.add(e5);
		List<Employee>employees2=new ArrayList<Employee>();
		employees2.add(e2);
		employees2.add(e3);
		employees2.add(e5);
		List<Employee>employees3=new ArrayList<Employee>();
		employees3.add(e1);
		employees3.add(e2);
		employees3.add(e3);
		employees3.add(e4);
		employees3.add(e5);
		List<Employee>employees4=new ArrayList<Employee>();
		employees4.add(e1);
		employees4.add(e4);
		employees4.add(e5);
		
		t1.setTech_id(111);
		t1.setTech_Name("Java");
		t1.setEmployees(employees1);
		
		t2.setTech_id(222);
		t2.setTech_Name("Python");
		t2.setEmployees(employees2);
		
		t3.setTech_id(333);
		t3.setTech_Name("MySQL");
		t3.setEmployees(employees3);
		
		t4.setTech_id(444);
		t4.setTech_Name("REACT");
		t4.setEmployees(employees4);
		
		Configuration conf=new Configuration().configure();
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		
		
		
		txn.commit();
		System.err.println("------->Done");
		

	}

}

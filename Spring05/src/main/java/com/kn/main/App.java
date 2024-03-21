package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.entites.Person;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-byName.xml");
		Person p=(Person) context.getBean("Person");
		System.out.println(p);
		context.close();
		
		ClassPathXmlApplicationContext context1=new ClassPathXmlApplicationContext("application.byType.xml");
		Person p1=(Person) context1.getBean("Person");
		System.out.println(p1);
		context1.close();
	}

}

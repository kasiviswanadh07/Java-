package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.bean.Laptop;

public class App {
	public static void main(String[] args) {
       
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		Laptop m1=(Laptop) context.getBean("m1");
		System.out.println("Object created by string "+m1);
		
		Laptop m2=(Laptop) context.getBean("m2");
		System.out.println("object created for string "+m2);
		context.close();
	}
}

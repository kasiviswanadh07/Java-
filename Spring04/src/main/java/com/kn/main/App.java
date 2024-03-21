package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.entites.University;

public class App {

	public static void main(String[] args) {
     ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
     University u=(University) context.getBean("university");
     System.out.println(u);
     context.close();
	}
    

}

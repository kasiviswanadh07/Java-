package com.kn.collections1.ArrayList;

import java.util.*;
public class collectionsDemo {

	public static void main(String[] args) {

		ArrayList list1=new ArrayList();
		System.out.println(list1.size());
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
	list1.add(10);
		
	list1.add(3, 80);
		
        
        System.out.println("index of(30): "+list1.indexOf(30));
        System.out.println("Index of(10): "+list1.indexOf(10));
        System.out.println("LastIndex of (10): "+list1.lastIndexOf(10));
		
        ArrayList list2=new ArrayList();
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		list2.add("five");
				
		System.out.println(list1);
        System.out.println("*********");
        System.out.println(list2);
        
        list2.addAll(list1);
        System.out.println(list2);
        list2.addAll(3, list1);
        System.out.println(list2);
	}

}

package com.collections.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
        
		LinkedList list=new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(1,110);
		list.set(1,22);
		list.add(10);
		
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println("Indexof(10) "+list.indexOf(10));
		System.out.println("Indexof(10) "+list.lastIndexOf(10));
		
		System.out.println("************");
		LinkedList list1=new LinkedList();
		list1.add("Ten");
		list1.add("Twenty");
		list1.add("Thirty");
		
		list1.addAll(list);
		System.out.println(list1);
	}
	

}

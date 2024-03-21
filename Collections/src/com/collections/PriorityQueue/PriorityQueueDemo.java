package com.collections.PriorityQueue;

import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue p1=new PriorityQueue();
		 
		p1.add(10);
		p1.add(20);
		p1.add(5);
		p1.add(30);
		
		PriorityQueue <String>p2=new PriorityQueue<String>();
		p2.add("one");
		p2.add("Thrree");
		p2.add("four");
		
		PriorityQueue <String> p3=new PriorityQueue <String>();
		p3.add("Apple");
		p3.add("Mango");
		p3.add("Promograned");
		
		p3.addAll(p2);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
	}

}

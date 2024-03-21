package com.collections.traversing;

import java.util.*;
public class TraversingDemo {

	public static void main(String[] args) {

		ArrayList <Object> list=new ArrayList<>();
		list.add("shirt");
		list.add("Jeans");
		list.add("cap");
		list.add(true);
		list.add(10);
		
//		1.Using Traversing
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for(Object s:list) {
			System.out.println(s+" ");
		}
//		3.Using Iterator
		System.out.println();
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
	}

}

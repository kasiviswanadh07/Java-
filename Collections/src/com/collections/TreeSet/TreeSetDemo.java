package com.collections.TreeSet;

import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet set=new TreeSet();
		set.add(10);
		set.add(5);
		set.add(30);
		set.add(20);
		set.add(15);
//		set.add(1.5) Heterogenoius data not allowed
		
		set.add(20);
		set.add(20);
		set.add(20);
//		set.add(20); Duplicates are not allowed
		set.add(20);
		
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("Apple");
		set1.add("PineApple");
		set1.add("Graphs");
		set1.add("Mango");
		set1.add("Orange");
		
		TreeSet<Integer> set2=new TreeSet<Integer>();	
		set2.add(50);
		set2.add(20);
		set2.add(30);
		set2.add(40);
		set2.add(100);
		
		System.out.println(set);
		System.out.println(set1);
		System.out.println(set2);
		
	}

}

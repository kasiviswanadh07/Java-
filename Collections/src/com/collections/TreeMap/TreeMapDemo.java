package com.collections.TreeMap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap map1=new TreeMap();
		map1.put(1, 100);
		map1.put(2, new Student(1,"Kasi",7.06));
		map1.put(3, 300);
		map1.put(4, new Student(2,"Viswanadh",7.09));
		map1.put(5, 500);
		
		System.out.println(map1);
	}

}

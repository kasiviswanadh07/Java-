package com.collections.HashMap;

import java.util.HashMap;


public class HashMapDemo {

	public static void main(String[] args) {

		HashMap map1=new HashMap();
		map1.put(1, 100);
		map1.put(2, new Student(1,"Kasi",7.06));
		map1.put(3, 300);
		map1.put("four", new Student(2,"Viswanadh",7.09));
		map1.put("Five", 500);
		System.out.println(map1);
	}

}

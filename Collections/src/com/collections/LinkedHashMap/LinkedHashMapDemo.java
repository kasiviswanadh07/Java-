package com.collections.LinkedHashMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

import com.collections.HashMap.Student;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap map1=new LinkedHashMap();
		map1.put(1, 100);
		map1.put(2, new Student(1,"Kasi",7.06));
		map1.put(3, 300);
		map1.put("four", new Student(2,"Viswanadh",7.09));
		map1.put("Five", 500);
		System.out.println(map1);
		
//		Accessing keys only using keyset() method which returns the set object
		Set ky=map1.keySet();
		System.out.println("Keys:"+ky);
		
//		Acessing key-value pair using entry set() method which returns set object
		Set kv=map1.entrySet();
		System.out.println("Key-values: "+kv);
		
//		Acessing only values using values () method which returns a collction object
		Collection values=map1.values();
		System.out.println("Values: "+values);
		
	}
	

}

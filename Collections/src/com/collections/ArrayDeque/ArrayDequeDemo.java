package com.collections.ArrayDeque;

import java.util.*;

public class ArrayDequeDemo {

	public static void main(String[] args) {

		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add("Thrity");
		ad.add(true);
		System.out.println(("First "+ad.getFirst()));
		System.out.println(("First "+ad.getLast()));
		
		ad.addFirst(111);
		ad.addLast(5154);
		
		
		System.out.println(ad);
		System.out.println(("First "+ad.getFirst()));
		System.out.println(("First "+ad.getLast()));
	}
}

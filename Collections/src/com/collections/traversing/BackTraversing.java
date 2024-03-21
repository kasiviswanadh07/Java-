package com.collections.traversing;

import java.lang.reflect.Array;
import java.util.*;
public class BackTraversing {

	public static void main(String[] args) {

		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.add(10);
		ad.add(50);
		ad.add(30);
		ad.add(90);
		ad.add(60);
		
		Iterator itr=ad.descendingIterator();	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList <Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println();
		ListIterator<Integer> itr1 =list.listIterator(list.size());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous()+" ");
		}
		
	}

}

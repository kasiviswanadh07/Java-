package com.coolections.wrapper;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {
		
		Integer il=new Integer(10);
		System.out.println(il);

		ArrayList<Integer> list=new ArrayList<>();
//		Auto Boxing
		list.add(10);  //list.add(new integer(10))
		list.add(20);
		list.add(30);
		System.out.println("Elements "+list);
		
//		Auto Unboxing
		int i=list.get(0);
		int i2=list.get(1);
		int i3=list.get(2);
		System.out.println("i1 "+i);
		System.out.println("i2 "+i2);
		System.out.println("i3 "+i3);
	}

}

package com.collections.traversing;

import java.util.*;
public class UpCastingCollections {

	public static void main(String[] args) {

		List lst=new ArrayList();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		
		List lst1=new LinkedList();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		
		Queue que=new ArrayDeque();
		que.add(10);
		que.add(10);
		que.add(10);
		
		Queue que1=new PriorityQueue();
		que.add(10);
		que.add(10);
		que.add(10);
	}

}

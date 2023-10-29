package com.kn.pack2;

import com.kn.pack1.Demo1;

public class Demo4 extends Demo1 {
  
	 public void dispaly1() {
		   System.out.println("Demo4 "+a);
		   System.out.println("Demo4 "+b);
//		   System.out.println("Demo4 "+c);--->package(default) it is accessible within the same package
//		   System.out.println("Demo4 "+d);--->private it is accessible within the same class
	   }
	
}

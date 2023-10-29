package com.kn.pack2;

import com.kn.pack1.Demo1;

public class Demo5 {

	

		 public void dispaly5() {
			 Demo1 d5=new Demo1();
			   System.out.println("Demo5 "+d5.a);
//			   System.out.println("Demo5 "+d5.b); -->protected its works only within the same heriracle inheritance
//			   System.out.println("Demo5 "+d5.c); --->package(default) it is accessible within the same package
//			   System.out.println("Demo5 "+d5.d); --->private it is accessible within the same class
		   }
		
		
	}



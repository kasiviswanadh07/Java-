package com.kn.multithreading2;

public class Demo {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println("****main()****");		}
      PrintNum t1=new PrintNum();
      t1.start();
      PrintChar t2=new PrintChar();
      t2.start();
		
	}

}

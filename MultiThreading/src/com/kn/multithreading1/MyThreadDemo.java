package com.kn.multithreading1;

public class MyThreadDemo {

	public static void main(String[] args) {
        Thread t2=Thread.currentThread();
        System.out.println(t2);
        MyThread t1=new MyThread();
        System.out.println(t1);
        t1.start();
        t1.setName("MyThread");
        t1.setPriority(0);
		
	}

}

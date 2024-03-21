package com.kn.multithreading;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {

		Thread t1=Thread.currentThread();
		System.out.println("Current Thread= "+t1);
	}

}

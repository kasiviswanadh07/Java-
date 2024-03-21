package com.kn.multithreading2;

public class PrintChar extends Thread{

	@Override
	public void run() {
		for(int i=65;i<=69;i++) {
			System.out.println((char)(i)+" ");
		}
	}
	

}

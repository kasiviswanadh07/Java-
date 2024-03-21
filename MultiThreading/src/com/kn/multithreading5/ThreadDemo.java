package com.kn.multithreading5;

public class ThreadDemo {

	public static void main(String[] args) {
   //creating the object of classes
//	Having independent actitvitiesdh rapeti anand kasi vi	
		PrintNumbers pn=new PrintNumbers();
		PrintCharcters pc=new PrintCharcters();
		
		Thread t1=new Thread(pn);
		Thread t2=new Thread(pc);
		t1.start();
		t2.start();
	}

}

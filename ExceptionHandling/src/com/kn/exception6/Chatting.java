package com.kn.exception6;

public class Chatting extends Thread {

	@Override
	public void run() {

		try {
			System.out.println("Chatting Started just now");
			Thread.sleep(2000);
			System.out.println("Chit chat chit chat........");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	    
		
		
		
		
	}
      
}

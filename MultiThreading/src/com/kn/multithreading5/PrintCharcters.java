package com.kn.multithreading5;

public class PrintCharcters implements Runnable {

	@Override
	public void run() {
    	for(int i=65;i<=74;i++) {
    		System.out.println("Charcters ="+i);
    		try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
	}
    
}

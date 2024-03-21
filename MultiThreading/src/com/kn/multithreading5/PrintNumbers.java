package com.kn.multithreading5;

public class PrintNumbers implements Runnable{

	@Override
	public void run() {
      for(int i=1;i<=10;i++) {
    	  System.out.println("Number ="+i);
    	  try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      }
	}

}

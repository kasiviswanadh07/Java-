package com.mt10.Intercommunication;

public class PizzaHouse {
	int token;
	boolean isAvailable=false;
	
	public synchronized void baker(int num) {
		
		if(isAvailable==false) {
		token=num;
		System.out.println("Baker baking for "+token);
		isAvailable=true;
		notify();
		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void eat() {
		if(isAvailable=true) {
		System.out.println("Customer eating pizza for "+token);
		isAvailable=false;
		notify();
		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

package com.mt10.Intercommunication;

public class Customer implements Runnable {
      
	PizzaHouse ph;
	public Customer(PizzaHouse ph) {
		this.ph=ph;
	}
	@Override
	public void run() {
        while(true) {
        	ph.eat();
        }
		
	}

}

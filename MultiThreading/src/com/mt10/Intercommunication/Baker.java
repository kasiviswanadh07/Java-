package com.mt10.Intercommunication;

public class Baker implements Runnable {

	PizzaHouse ph;
	int num=1;
	public Baker(PizzaHouse ph) {
		this.ph=ph;
	}
	@Override
	public void run() {
		while(true) {
		ph.baker(num++);
		}
	}

}

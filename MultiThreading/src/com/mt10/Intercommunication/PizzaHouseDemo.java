package com.mt10.Intercommunication;

public class PizzaHouseDemo {

	public static void main(String[] args) {

		PizzaHouse ph=new PizzaHouse();
		Baker baker=new Baker(ph);
		Customer consumer=new Customer(ph);
		
		Thread t1=new Thread(baker);
		Thread t2=new Thread(consumer);
		
		t1.start();
		t2.start();
	}

}

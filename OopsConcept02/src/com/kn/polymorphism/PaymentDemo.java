package com.kn.polymorphism;

public class PaymentDemo {

	public static void main(String[] args) {
          Payment p;
          
          p=new Upi();
          p.bill();
          p.offer();
          p.pay();
          System.out.println();
        
          
          p=new Wallet();
          p.bill();
          p.offer();
          p.pay();
          System.out.println();
          
          p=new Card();
          p.bill();
          p.offer();
          p.pay();
		
	}

}

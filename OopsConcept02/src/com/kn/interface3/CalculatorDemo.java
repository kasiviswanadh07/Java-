package com.kn.interface3;

public class CalculatorDemo {

	public static void main(String[] args) {
        MyCalculator mc=new MyCalculator();
        callmethods(mc);
//        Calculator1 c=new Calculator1(); we can't call interfaces 
    
	}
	public static void callmethods(MyCalculator m) {
		m.addition();
		m.subtraction();
		m.division();
		m.multiplication();
	}

}

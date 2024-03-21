package com.kn.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
//        Car car=new Car();
		ElectricCar electricCar=new ElectricCar();
		PetrolCar petrolcar=new PetrolCar();
		DieselCar diesel=new DieselCar();
		
		electricCar.start();
		electricCar.stop();
		electricCar.refuel();
		System.out.println("**************************");
		
		petrolcar.start();
		petrolcar.stop();
		petrolcar.refuel();
		System.out.println("***************************");
		
		diesel.start();
		diesel.stop();
		diesel.refuel();
		
		
		
		
	}

}

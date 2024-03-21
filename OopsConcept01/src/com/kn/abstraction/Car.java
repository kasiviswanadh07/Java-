package com.kn.abstraction;

abstract public class Car {

	public void start() {
		System.out.println("car has been started");
	}
	public void stop() {
		System.out.println("car has been stopped");
	}
	public abstract void refuel();
}

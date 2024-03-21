package com.kn.interfaces;

public class MechStudent implements Student {

	@Override
	public void study() {
		System.out.println("----->>Studying AutoCAD for 5 min");
	}

	@Override
	public void doproject() {
		System.out.println("----->>>Working on Robotics Project");
	}

}

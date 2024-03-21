package com.kn.encapsulation;

import java.util.Scanner;

public class ClassRoomDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassRoom c1 = new ClassRoom();
		System.out.println("Temperature = " + c1.getTemperature());
		System.out.println("Enter the temperature");
        c1.setTemperature(scan.nextInt());
        System.out.println("Temperature = " + c1.getTemperature());
	}

}

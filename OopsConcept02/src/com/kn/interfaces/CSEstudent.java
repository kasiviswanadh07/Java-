package com.kn.interfaces;

public class CSEstudent implements Student {

	@Override
	public void study() {
		 System.out.println("Studying alogrithms from 20hours");
	}

	@Override
	public void doproject() {
         System.out.println("Working on college library project");		
	}
      
}

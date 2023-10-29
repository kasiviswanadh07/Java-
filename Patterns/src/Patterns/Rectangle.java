package com.kn.Patterns;

public class Rectangle {

	public static void main(String[] args) {
//		System.out.println("Printing pattern");
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print((char)(64+i));
//			}
//			System.out.println(" ");

//		}
//System.out.println("Printing pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((char)(64 + j)+" ");
			}
			System.out.println(" ");
		}
		
	}

}

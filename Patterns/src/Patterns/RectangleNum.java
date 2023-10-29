package com.kn.Patterns;

public class RectangleNum {

	public static void main(String[] args) {
		System.out.println("Pattern printing");
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 5; j >= 1; j--) {
//				System.out.print((i)+" ");
//			}
//			System.out.println(" ");
//		}
//		System.out.println("Pattern printing");
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 5; j>=1; j--) {
//				System.out.print((char)(64+j)+" ");
//			}
//			System.out.println(" ");
		System.out.println("Pattern printing");
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println(" ");
		}
//		}
	}

}

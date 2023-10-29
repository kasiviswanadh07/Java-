package com.kn.Patterns;

public class Triangle {

	public static void main(String[] args) {
//		System.out.println("Pattern printing");
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print((j)+(" "));
//			}
//			System.out.println("");	
//		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print(j+(""));
				}else {
					System.out.print(" ");
				}
				
			}System.out.println(" ");

		}
	}

}

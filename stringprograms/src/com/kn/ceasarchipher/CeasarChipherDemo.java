package com.kn.ceasarchipher;

import java.util.Scanner;

public class CeasarChipherDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString = scan.nextLine();
		System.out.println("Enter the key value");
		int keyvalue = scan.nextInt();

		CeasarChipherApp ceaser = new CeasarChipherApp();
		System.out.println(ceaser.isceaserchiper(inputString, keyvalue));
		scan.close();

	}

}

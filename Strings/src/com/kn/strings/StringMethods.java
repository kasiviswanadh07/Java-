package com.kn.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Rapeti Anand Kasi Viswanadh";

		System.out.println(s1);
		System.out.println("To Convert into Uppercase");
		System.out.println(s1.toUpperCase());
		System.out.println("To Convert into Lowercase :");
		System.out.println(s1.toLowerCase());
		System.out.println("Returns the Charcter at Specified Index :");
		System.out.println(s1.charAt(7));
		System.out.println("Returns the Index Value For First occurance of Specified Charcter :");
		System.out.println(s1.indexOf('A'));
		System.out.println("Returns the Index Value For Last occurance of Specified Charcter :");
		System.out.println(s1.lastIndexOf('a'));
		System.out.println("Returns String Starting From Specified Index :");
		System.out.println(s1.substring(7));
		System.out.println("Returns String Starting From Specified Index and Ends Specified index :");
		System.out.println(s1.substring(7, 17));
		System.out.println("Returns boolean value based on specified value :");
		System.out.println(s1.contains("Anand"));
		System.out.println("Length of the string");
		System.out.println(s1.length());

		System.out.println(s1.startsWith("Rapeti"));

		System.out.println(s1.endsWith("dh"));
		 
		char[]crr=s1.toCharArray();
		System.out.println(s1.length());
		System.out.println(crr.length);
		
		System.out.println("Returns the array string in reverse");
		for(int i=crr.length-1;i>=0;i--) {
			System.out.print(crr[i]);
			
		}
		System.out.println("");
		System.out.println("Returns the Array String and remove spaces b/w words");
		String srr[]=s1.split(" ");
		for(int i=0;i<srr.length;i++) {
			System.out.print(srr[i]);
		}
		for(int i=srr.length;i>=0;i--) {
			System.out.println(srr[i]);
		}
		System.out.println();
		
		System.out.println(s1.trim());
		System.out.println(s1.split(s1));
		System.out.println(s1.replace('a', 'M'));
		System.out.println(s1.replaceAll(s1, "kasi"));
	}

}

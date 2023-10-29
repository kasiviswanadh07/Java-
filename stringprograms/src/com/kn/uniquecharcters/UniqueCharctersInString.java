package com.kn.uniquecharcters;

import java.util.Scanner;

public class UniqueCharctersInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
        String s1=scan.nextLine();
         
        UniqueCharcterApp isunique=new UniqueCharcterApp();
         isunique.uniqueCharcter(s1);
        
       
	}

}

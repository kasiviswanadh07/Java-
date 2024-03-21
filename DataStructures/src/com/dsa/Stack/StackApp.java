package com.dsa.Stack;

import java.util.Scanner;


public class StackApp {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int n=scan.nextInt();
		Stack s=new Stack(n);
		
		while(true) {
		System.out.println("press 1 for Push");
		System.out.println("press 2 for pop");
		System.out.println("Press 3 for display");
		System.out.println("Enter any other key for exit");
		int key=scan.nextInt();		
		
			switch (key) {
			case 1: s.push();
			        break;
			case 2: s.pop();
			        break;
			case 3: s.display();
			        break;
			
			default:        
				 System.out.println("Execution completed");
				System.exit(0);
			}
		}
	}

}

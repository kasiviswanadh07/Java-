package com.dsa.Queue;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Queue");
		int n = scan.nextInt();
		Queue queue = new Queue(n);
		while (true) {
			System.out.println("press 1 for insertion");
			System.out.println("press 2 for Deletion");
			System.out.println("press 3 for Display");
			System.out.println("press any other key for exit");
			System.out.println("choose form one from above");
			int key = scan.nextInt();
			switch (key) {
			case 1:
				queue.insertion();
				break;
			case 2:
				queue.deletion();
				break;
			case 3:
				queue.display();
				break;
			default:
				System.exit(key);
			}

		}
	}

}

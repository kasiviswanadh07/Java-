package com.dsa.CircularQueue;

import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = scan.nextInt();
		CircularQueue queue = new CircularQueue(n);

		while (true) {
			System.out.println("Press 1 For Insertion");
			System.out.println("Press 2 For Deletion");
			System.out.println("Press 3 For Display");
			System.out.println("Press Any Key For Exit");

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

			default:System.out.println("-------->Execution completed<----------");
				System.exit(key);
			}
		}
	}

}

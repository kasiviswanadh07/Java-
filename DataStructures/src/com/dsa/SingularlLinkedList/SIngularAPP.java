package com.dsa.SingularlLinkedList;

import java.util.Scanner;

public class SIngularAPP {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		SingularLinkedList list = new SingularLinkedList();
		while (true) {
			System.out.println("Press 1--------insertion at rare");
			System.out.println("Press 2--------Deletion at rare");
			System.out.println("Press 3--------insertion at Front");
			System.out.println("Press 4--------Deletion at Front");
			System.out.println("Press 5--------Display");
			System.out.println("Press any key for exit");
			System.out.println("Enter your choice");
			int key = scan.nextInt();
			switch (key) {
			case 1:
				list.insertrare();
				break;
			case 2:
				list.deleteRare();
				break;
			case 3:
				list.insertFront();
				break;
			case 4:
				list.deleteFront();
				break;
			case 5:
				list.display();
				break;

			default:
				System.exit(key);
			}
		}
	}

}

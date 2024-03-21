package com.dsa.SingularlLinkedList;

import java.util.Scanner;

public class SingularLinkedList {

	class Node {
		int data;
		Node link;
	}

	private Node first;
	private Scanner scan = new Scanner(System.in);

	public void insertrare() {
		Node temp;
		System.out.println("Enter the element");
		int elem = scan.nextInt();
		Node newNode = new Node();
		newNode.data = elem;
		newNode.link = null;

		if (first == null) {
			first = newNode;
		} else {
			temp = first;
			while (temp.link!= null) {
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}

	public void deleteRare() {
		Node temp;
		if (first == null) {
			System.out.println("Deletion Not Possible");
		} else if (first.link == null) {
			System.out.println("Element deleted at " + first.data);
		} else {
			temp = first;
			while (temp.link.link != null) {
				temp = temp.link;
			}
			System.out.println("Element deleted is " + temp.link.data);
			temp.link = null;
		}
	}

	public void insertFront() {
		System.out.println("Enter an element");
		int elem = scan.nextInt();
		Node newNode = new Node();
		newNode.data = elem;
		newNode.link = null;
		if (first == null) {
			first = newNode;
		} else {
			newNode.link = first;
			first = newNode;
		}
	}

	public void deleteFront() {
		if (first == null) {
			System.out.println("Deletion Not Possible");
		} else if (first.link != null) {
			System.out.println("Element deleted is " + first.data);
			first = null;
		} else {
			System.out.println("Element deleted is " + first.data);
			first = first.link;
		}
	}
	public void display() {
		Node temp;
		if(first==null) {
			System.out.println("Display Not Possible");
		}else if(first.link==null){
			System.out.println(first.data);
		}else {
			temp=first;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
			System.out.println();
		}
	}
}

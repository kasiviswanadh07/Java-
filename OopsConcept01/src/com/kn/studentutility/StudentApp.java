package com.kn.studentutility;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many objects to be created");
		Student[] s = new Student[scan.nextInt()];

		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter ID for the student " + (i + 1));
			int id = scan.nextInt();

			System.out.println("Enter Name for the student " + (i + 1));
			String name = scan.next();

			System.out.println("Enter Marks for the student " + (i + 1));
			int marks = scan.nextInt();

			s[i] = new Student(id, name, marks);
		}

		StudentOperations sO = new StudentOperations();
		System.out.println("Enter number to perform operation..");
		System.out.println("1. Sort student by Id Asc");
		System.out.println("2. sort student by Id Dsc");
		System.out.println("3. sort student by Name Asc");
		System.out.println("4. sort student by Name Dsc");
		System.out.println("5. Search student by Id");
		System.out.println("6. Search student by Name");
		System.out.println("7. Apply grace marks");

		int opt = scan.nextInt();
		switch (opt) {
		case 1: {
			sO.sortByIdAsc(s);
			for (int i = 0; i < s.length; i++) {
				System.out.println("ID = " + s[i].id + " Name = " + s[i].name + " Marks = " + s[i].marks);
			}
			break;
		}
		case 2: {
			sO.sortByIdDsc(s);
			for (int i = 0; i < s.length; i++) {
				System.out.println("ID = " + s[i].id + " Name = " + s[i].name + " Marks = " + s[i].marks);
			}
			break;
		}
		case 3: {
			sO.sortByNameAsc(s);
			for (int i = 0; i < s.length; i++) {
				System.out.println("ID = " + s[i].id + " Name = " + s[i].name + " Marks = " + s[i].marks);
			}
			break;
		}
		case 4: {
			sO.sortByNameDsc(s);
			for (int i = 0; i < s.length; i++) {
				System.out.println("ID = " + s[i].id + " Name = " + s[i].name + " Marks = " + s[i].marks);
			}
			break;
		}
		case 5: {
			sO.sortByIdAsc(s);
			System.out.println("Enter Id to search student");
			int targetId = scan.nextInt();
			int pos = sO.searchById(s, targetId);
			if (pos >= 0) {
				System.out.println("ID = " + s[pos].id + " Name = " + s[pos].name + " Marks = " + s[pos].marks);
			} else {
				System.out.println("Id not found");
			}
		}
		case 6: {
			sO.sortByNameAsc(s);
			System.out.println("Enter Name to search student");
			scan.nextLine();
			String targetName = scan.nextLine();
			int pos = sO.searchByName(s, targetName);
			if (pos >= 0) {
				System.out.println("ID = " + s[pos].id + " Name = " + s[pos].name + " Marks = " + s[pos].marks);
			} else {
				System.out.println("Name not found");
			}
		}
		case 7: {
			System.out.println("Enter grace marks");
			int grace = scan.nextInt();
			sO.applyGrace(s, grace);
			for (int i = 0; i < s.length; i++) {
				System.out.println("ID = " + s[i].id + " Name = " + s[i].name + " Marks = " + s[i].marks);
			}
		}
		}
		System.out.println("Rate Application...(1-10)");
		int rating = scan.nextInt();
		for (int i = 1; i <= rating; i++) {
			System.out.print("*");
		}
		scan.close();
	}
}

package com.kn.Arrays;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//        array Declaration&creation
		System.out.println("Enter the Number of students");
		int numberOfStudents = scan.nextInt();
		System.out.println("Enter the number of subjects");
		int numberOfSubjects = scan.nextInt();
		int[][] arr = new int[numberOfStudents][numberOfSubjects];

//		array initialisation

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter data for student :" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Subject " + (j + 1) + " Marks");
				arr[i][j] = scan.nextInt();
			}
		}
		

//		array transversing

		for (int i = 0; i < arr.length; i++) {
			System.out.println("====student " + (i + 1)+" Data====");
			for (int j = 0; j < arr[i].length; j++) {				
				System.out.println("subject "+(j+1)+" Marks : "+ arr[i][j]);
			}

		}scan.close();
	}
}

package com.kn.studentuserinputarray;

import java.util.Scanner;

public class StudentUserInputArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many student objects to be created");
		StudentUserInputArrayApp[] srr = new StudentUserInputArrayApp[scan.nextInt()];
		for (int i = 0; i < srr.length; i++) {
			System.out.println("Enter ID for student " + (i + 1));
			int id = scan.nextInt();

			System.out.println("Enter Name for student " + (i + 1));
			String name = scan.next();

			System.out.println("Enter Marks for student " + (i + 1));
			int marks = scan.nextInt();

			srr[i] = new StudentUserInputArrayApp(id, name, marks);
		}
//		for (StudentUserInputArrayApp s : srr) {
//			System.out.println("ID = " + s.id + ", Name = " + s.name + ", Marks= " + s.marks);
//			scan.close();
//		}
		System.out.println("Enter id need to be searched");
		int target=scan.nextInt(); int position=-1;
		int low=0;int high=srr.length-1;
		int mid =0;
		boolean isIdFound=false;
		while(low<=high) {
			mid=(low+high)/2;
			if(target==srr[mid].id) {
				isIdFound=true;
				position=mid+1;
				break;
			}else if(target>srr[mid].id) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		scan.close();
		
		
	}

}

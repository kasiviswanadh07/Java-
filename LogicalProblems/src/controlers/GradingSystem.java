package controlers;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=scan.nextInt();
		if (marks>=90) {
			System.out.println("A Grade");
		}
		else if (marks>=75 && marks<90) {
			System.out.println("B Grade");
		}
		else if (marks>=60 && marks<75) {
			System.out.println("C Grade");
		}
		else if(marks>=45 && marks<60) {
			System.out.println("D Grade");
		}
		else if(marks>=35 && marks<45) {
			System.out.println("E Grade");
		}
		else{
			System.out.println("Try Again.......");
		}
		scan.close();

	}

}

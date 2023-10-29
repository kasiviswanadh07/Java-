package controlers;

import java.util.Scanner;

public class IfMarks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		if(score>=60) {
			System.out.println("Passed");
		}
			else {
				System.out.println("Failed");
			
		}

	}

}

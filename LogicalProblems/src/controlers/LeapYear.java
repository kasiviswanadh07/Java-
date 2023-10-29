package controlers;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int year=scan.nextInt();
		if(year%4==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Non-Leap Year");
		}

	}

}

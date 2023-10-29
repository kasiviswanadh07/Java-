package controlers;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		if (age>=60){
			System.out.println("Senior Citizen Discount Applicable");
		}
		else {
			System.out.println("Regular Charges Applicable");
		}

	}

}

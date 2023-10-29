package controlers;

import java.util.Scanner;

public class IfAmountPositive {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int balance=scan.nextInt();
		if (balance<0) {
			System.out.println("Negative Balance");
		}
			else {
				System.out.println("Positive Balance");
			}
			
		}
	}



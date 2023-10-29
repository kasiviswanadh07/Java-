package controlers;

import java.util.Scanner;

public class JumpingStatements {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan =new Scanner(System.in);
		int range=scan.nextInt();
		for (int i = 1;i<=range;i++) {
			if (i%3==0) {
				System.out.println("Divisible by 3="+i);
				continue;
			}else {
				System.out.println("Not divisible by 3="+i);
			}
			System.out.println("Within body of for loop");
		}
	}

}

package kom.kn.nonreaptingchar;

import java.util.Scanner;

public class NonReaptingCharDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scan.nextLine();
		
		NonReaptingCharApp charcter=new NonReaptingCharApp();
		char result=charcter.isNonReapting(s1);
		System.out.println("The first non repeating character :"+result);
		scan.close();
	}

}

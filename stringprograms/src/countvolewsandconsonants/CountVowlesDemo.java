package countvolewsandconsonants;

import java.util.Scanner;
public class CountVowlesDemo {

	public static void main(String[] args) {
		   Scanner scan=new Scanner(System.in);
		     System.out.println("Enter the string");
		     
		     String s1=scan.nextLine();
		     
		     CountVowlesApp count=new CountVowlesApp();
		     count.isCountVowles(s1);
	}

}

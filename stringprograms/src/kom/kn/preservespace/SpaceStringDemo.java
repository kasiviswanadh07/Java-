package kom.kn.preservespace;

import java.util.Scanner;

public class SpaceStringDemo {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the string");
      String s1=scan.nextLine();
      
      SpaceStringApp preserve=new SpaceStringApp();
		
		System.out.println(preserve.ispreserveSpace(s1));
		
		
		
		
		
		
	}
	
	
	

}

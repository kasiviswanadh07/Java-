//write a program to determine
package controlers;

import java.util.Scanner;
 class IfelseVowelOrConsonant {

	public static void main(String[] args) {
		Scanner scan =new Scanner("System.in");
		System.out.println("Enter a charcter");
		  char c=scan.next().charAt(0);
		
		  if (c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u') 
		  {
			  System.out.println("vowle");
		  }
		  else if(c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')
		  {
			  System.out.println("vowle");
		  }
		  else 
		  {
			  System.out.println("Consonant");
		  }
		  scan.close();
			 

	}

}

package controlers;
import java.util.Scanner;
public class ConsonantOrVowle {
      public static void main(String[]args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter a char");
	  char c=scan.next().charAt(0);
	
	  if (c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u') {
		  System.out.println("vowle");
	  }
	  else {
		  System.out.println("charcter");
	  }
	  scan.close();
	  
	}

}

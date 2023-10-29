import java.util.Scanner;

public class ReplaceTheChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the set of strings");
 
		String inputString=scan.nextLine();
		
		Replace replace=new Replace();
		 String ouputString=replace.Replace(inputString);
		  {
			 System.out.println(ouputString);
			 
		 }
	
		
	}

}

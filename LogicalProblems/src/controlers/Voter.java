package controlers;
import java.util.Scanner;
public class Voter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age =scan.nextInt();
		scan.close();
		if (age>=18) {
			System.out.println("Voter registration eligible");
		}
		

	}

}

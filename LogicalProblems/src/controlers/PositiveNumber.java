package controlers;
import java.util.Scanner;
public class PositiveNumber {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		
		if (a>b) {
			System.out.println("difference="+(a-b));
		}
		else {
			System.out.println("difference="+(b-a));
		}
		scan.close();
			
		

	}

}

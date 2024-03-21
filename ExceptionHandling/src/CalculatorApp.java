import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Calculator Application");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Numerator value= ");
		int numerator=scan.nextInt();
		System.out.println("Enter the Denominator value");
		int denominator=scan.nextInt();
		double division=0;
		try {
			division=numerator/denominator;
		}catch(ArithmeticException ae) {
			System.out.println("Kindly provide denominator as Non-Zero");
		}
		System.out.println("Division "+division);
		System.out.println("Thank you for Using the caculator Application "); 
		
	}

}

package controlers;
import java.util.Scanner;
public class PositiveOrNegavtive {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
        int a=scan.nextInt();
        if (a<0) {
        	System.out.println("Negative");
        }
        else {
        	System.out.println("Positive");
        }
        scan.close();
	}

}

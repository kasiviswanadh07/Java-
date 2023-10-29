package controlers;
import java.util.Scanner;

public class RideAccess {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		if (age>=12) {
			System.out.println("Ride access granted");
		}

	}

}

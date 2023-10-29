package controlers;
import java.util.Scanner;
public class Marks {


		public static void main(String[] args) {
			System.out.println("Enter your age");
			Scanner scan=new Scanner(System.in);
			int age=scan.nextInt();
			if (age>=18) {
				System.out.println("your are eligible for vote");
			}
			else
			{
				System.out.println("you are not eligible for voting");
				
			}
			scan.close();

		}

	}



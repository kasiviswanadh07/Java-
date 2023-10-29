package controlers;
import java.util.Scanner;
public class TechFest {

	public static void main(String[] args) {
          System.out.println("Enter your marks");
          Scanner scan =new Scanner(System.in);
          int marks=scan.nextInt();
          if(marks>90) {
        	  System.out.println("wellcome to the techfest");
          }
          else if(marks>=70){
        	  System.out.println("you have to get more marks");
          }
          else 
          {
        	  System.out.println("you are not invited to techfest");
          }
          scan.close();
        	 
          

	}

}

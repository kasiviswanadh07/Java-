package controlers;
import java.util.Scanner;
public class ForTyping {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		char capital=scan.next().charAt(0);
		scan.close();
		if(capital >= 'A' && capital <= 'Z'){
			System.out.println("Capital letter detected");
		}

	}

}

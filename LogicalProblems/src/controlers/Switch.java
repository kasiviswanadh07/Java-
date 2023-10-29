package controlers;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a charcter");
		char c=scan.next().charAt(0);
		
        switch (c) {
		case 'v' :
			System.out.println("voliet");
			break;
	    case 'i' :
	    	System.out.println("indigo");
	    	break;
	    case 'b' :
	    	System.out.println("blue");
	    	break;
	    case 'g' :
	    	System.out.println("green");
	    	break;
	    case 'y' :
	    	System.out.println("yellow");
	    	break;
	    case 'o' :
	    	System.out.println("orage");
	    	break;
	    case 'r' :
	    	System.out.println("red");
	    	default:
	    		System.out.println("Not a rainbow colour");
	    		scan.close();
	    	
		}

	}
}

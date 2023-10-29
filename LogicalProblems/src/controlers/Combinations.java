package controlers;

public class Combinations {

	public static void main(String[] args) {
		int a=17;
		if (a<=10) {
			System.out.println("if body");
			if (a>15) {
				System.out.println("Inner if body");
			}
		    else {
				System.out.println("Inner else body");
				}
			}else {
				System.out.println("Else body");
				if (a>5) {
					System.out.println("Nested else if");
				}else {
					System.out.println("Nested else body");
				}
		System.out.println("The end");	
			 
		}

	}

}

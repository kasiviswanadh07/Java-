package controlers;

public class NestedLoopDemo {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			System.out.println("i="+i);
		
			 for(int j=1;j<=3;j++) {
			System.out.println("j="+j);
			 }
			 System.out.println("out of  inner loop");
		}
			 
		
		 System.out.println("out of loop");
			}
	     
		

	}



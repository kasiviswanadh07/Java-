import java.util.Scanner;

public class EquilateralTriangle {
public static void main(String[] args) {
//Scanner sc = new Scanner(System.in);
//	System.out.println("enter no of rows");
//	int n= sc.nextInt();
//	
//	for (int i = 1; i <=n; i++) 
//	{
//		for (int j = n; j>i; j--) 
//		{
//			System.out.print(" ");
//		}
//			for (int k =1; k <=i; k++)
//			{
//				System.out.print("*");
//			}
//		System.out.println();
//	}
	
	
	
        
        for(int i = 0; i < 5; i++) {  
            for(int j = 0; j < 5; j++) {  
                if((i == 0 || i == 5 / 2 || i == 5 - 1)) {  
                    System.out.printf("*");  
                }else if(i < 5 / 2 && j == 0){  
                    System.out.printf("*");  
                }else if(i > 5 / 2 && j == 5 - 1){  
                    System.out.printf("*");  
                }else {  
                    System.out.printf(" ");  
                }  
            }  
            System.out.printf("\n");  
        }  
    }  
}


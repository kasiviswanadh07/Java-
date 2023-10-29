package com.PatternsYT;

public class Pattern6 {

	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j>=i) {
//					System.out.print(j);
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.println();
//		}
//
//	}
/* 
12345    //sop i
 2345    
  345
   45
    5*/
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j>=i) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}

	}
}
/*11111
 2222       sop j
  333
   44
    5*/


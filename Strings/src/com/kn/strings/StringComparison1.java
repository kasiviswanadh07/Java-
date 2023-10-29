package com.kn.strings;

public class StringComparison1 {

	public static void main(String[] args) {
       String s1="Ram";
       String s2="ram";
      
//       Reference comparison
       if(s1==s2) {
    	   System.out.println("Referances are point to same object");
       }else {
    	   System.out.println("References are point to different objects");
       }
//       String data comparison
       if(s1.equals(s2)) {
    	   System.out.println("String object data is equal");
       }else {
    	   System.out.println("String object data is unequal");
       }
		
		
		
		
		
		
		
	}

}

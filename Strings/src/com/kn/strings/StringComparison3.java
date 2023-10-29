package com.kn.strings;

public class StringComparison3 {

	public static void main(String[] args) {
      String s1="Ram";
      String s2="Sita";
      String s3=s1+s2;
      String s4=s1+s2;
//      Reference Comparison
      if(s3==s4) {
    	  System.out.println("Reference are same");
      }else {
    	  System.out.println("Reference are different");
      }
//     Data comparison
		if(s3.equals(s4)) {
			System.out.println("Data is equal");
		}else {
			System.out.println("Data is unequal");
		}
		
		
		
		
	}

}

package com.kn.strings;

public class StringComparison4 {

	public static void main(String[] args) {
      String s1="Ram";
      String s2="Sita";
      String s3=s1+"Sita";
      String s4="Ram"+s2;
      
//	Reference comparison
	  if(s3==s4) {
		  System.out.println("Reference are same");
	  }else {
		  System.out.println("Reference are different");
	  }
//		Data Comparison
	  if(s3.equals(s4)) {
		  System.out.println("Data are equal");
	  }else {
		  System.out.println("Data are unequal");
	  }
	  
	  
	}

}

package com.kn.strings;

public class StringComparison2 {

	public static void main(String[] args) {
      String s1="Ram";
      String s2="Sita";
      String s3="Ram"+"Sita";
      String s4="Ram"+"Sita";
//      String Reference comparison
      if(s3==s4) {
    	  System.out.println("References are same");
      }else {
    	  System.out.println("References are different");
      }
//      String data comparision
      if(s3.equals(s4)) {
    	  System.out.println("String data equal");
      }else {
    	  System.out.println("String data unequal");
      }
      
      
      
      
	}

}

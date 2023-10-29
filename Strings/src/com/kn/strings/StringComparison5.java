package com.kn.strings;

public class StringComparison5 {

	public static void main(String[] args) {
       String s3="Ram";
       String s4=s3;
//       Reference comprison
       if(s3==s4) {
    	   System.out.println("Reference is same");
       }else {
    	   System.out.println("Reference is different");
       }
//	    Data Comparsion
       if(s3.equals(s4)) {
    	   System.out.println("Data are same");
       }else {
    	   System.out.println("Data are different");
       }
		
		
		
	}

}

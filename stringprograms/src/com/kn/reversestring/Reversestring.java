package com.kn.reversestring;

public class Reversestring {
    public String reverseString(String inputstring) {
//    	Method to Reverse string
    	StringBuffer outputString=new StringBuffer();
    	for(int i=inputstring.length()-1;i>=0;i--) {
    		outputString=outputString.append(inputstring.charAt(i));
    	}

		return outputString.toString();
    	
    }
}

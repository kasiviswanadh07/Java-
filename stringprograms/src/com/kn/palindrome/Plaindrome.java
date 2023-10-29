package com.kn.palindrome;

public class Plaindrome {
	public String isPalindrom(String inputString) {
//    	Method to palindrome
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = inputString.length() - 1; i >= 0; i--) {
			stringBuffer = stringBuffer.append(inputString.charAt(i));
		}
		if (stringBuffer.toString().equals(inputString)) {
			System.out.println("is palindrome");

		}
		return stringBuffer.toString();

	}

}

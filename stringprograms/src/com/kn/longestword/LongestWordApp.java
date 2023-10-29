package com.kn.longestword;

public class LongestWordApp {

	public String FindLongestWordApp(String input) {
		String[] srr=input.split(" ");
		String temp="";
		for(String i:srr) {
			if(i.length()>temp.length()) {
				temp=i;
			}
		}
		return temp;
		
	}
      
}

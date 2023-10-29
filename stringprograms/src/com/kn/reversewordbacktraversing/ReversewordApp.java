package com.kn.reversewordbacktraversing;

public class ReversewordApp {

	public void reverseWord(String input) {
		String []srr=input.split(" ");				
		for(int i=0;i<srr.length;i++) {
			char crr[]=srr[i].toCharArray();
			for(int j=crr.length-1;j>=0;j--) {
				System.out.print(crr[j]);
			}
		}		
		
	}

}

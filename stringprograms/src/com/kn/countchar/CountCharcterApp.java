package com.kn.countchar;

public class CountCharcterApp {
	public int countcharcter(String s1, char ch) {
		int count=0;
		char []crr=s1.toCharArray();
		for(int i=0;i<crr.length;i++) {
			if(crr[i]==ch) {
				count++;
			}
		}		
		return count;
		
	}

}

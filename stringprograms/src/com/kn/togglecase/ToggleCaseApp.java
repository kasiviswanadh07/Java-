package com.kn.togglecase;

public class ToggleCaseApp {

	public String ischange(String input) {
//		String []srr=input.split(" ");
		 
			char []crr=input.toCharArray();
//			condition checking for Upper case			
			for(int i=0;i<crr.length;i++) {
				if(crr[i]>=65&&crr[i]<=90) {
					crr[i]=(char)(crr[i]+32); 
				}
//				condition checking for Upper case
				else if(crr[i]>=97&&crr[i]<=122) {
					crr[i]=(char)(crr[i]-32);
				}
		}StringBuffer sb=new StringBuffer();
		for(char c:crr) {
			sb.append(c);
		}
		return sb.toString();
		
		
		
	}

}

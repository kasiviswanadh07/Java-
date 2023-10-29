package com.kn.titlecase;

public class TitleCaseApp {

	public String ischange(String inputString) {
		String []srr=inputString.split(" ");
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<srr.length;i++) {	
			char []crr=srr[i].toCharArray();
			for(int j=0;j<crr.length;j++) {
				if(crr[0]>=97 &&crr[0]<=122) {
					crr[0]=(char)(crr[0]-32);
				}
			}			
			for(char c:crr) {
				sb.append(c);
			}}
		
		return sb.toString();		
		
	}
		

}

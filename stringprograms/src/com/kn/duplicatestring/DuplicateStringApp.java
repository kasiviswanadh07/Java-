package com.kn.duplicatestring;

public class DuplicateStringApp {

	public String isDuplicate(String input) {
		char []crr=input.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<crr.length;i++) {
			int count =0;
			for(int j=i+1;i<crr.length;j++) {
				if(crr[i]==crr[j]) {
					count++;
				}
			if (count==1) {
				
			}
				
			}
			for(char c:crr) {
				sb=sb.append(c);
			}
		}
		return sb.toString();
		
		
		
		
	}

}

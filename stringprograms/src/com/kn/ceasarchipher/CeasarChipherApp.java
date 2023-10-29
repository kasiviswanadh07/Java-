package com.kn.ceasarchipher;

public class CeasarChipherApp {

	public String isceaserchiper(String inputString, int keyvalue) {
		while(keyvalue>26) {
			keyvalue=keyvalue-26;
		}
		char[]crr=inputString.toCharArray();
		for(int i=0;i<crr.length;i++) {	
			if(crr[i]>=65&&crr[i]<=90-keyvalue||crr[i]>=97&&crr[i]<=122-keyvalue) {
				
					crr[i]=(char)(crr[i]+keyvalue);
				}else {
					crr[i]=(char)(crr[i]+keyvalue-26);
			}
			
		
		}
		StringBuffer sb=new StringBuffer();
		for(char c:crr) {
			sb.append(c);
		}
		return sb.toString();		
		
	}

}

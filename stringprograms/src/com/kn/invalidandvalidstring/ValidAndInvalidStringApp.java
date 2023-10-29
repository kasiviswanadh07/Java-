package com.kn.invalidandvalidstring;

public class ValidAndInvalidStringApp {

	public boolean validOrInvalid(String inputString) {
		
		char []crr=inputString.toCharArray();
		int paranthesis=0,square=0,curly=0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i]=='(') {
				paranthesis++;
			}else if(crr[i]==')') {
				paranthesis--;
			}else if(crr[i]=='[') {
				square++;
			}else if(crr[i]==']') {
				square--;
			}else if(crr[i]=='{') {
				curly++;
			}else if(crr[i]=='}') {
				curly--;
			}
			
			}if(paranthesis==0&&square==0&&curly==0) {
				return true;
		}						
		return false;				
	}

}

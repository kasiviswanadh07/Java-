package com.kn.romannumbers;

public class RomanNumbersApp {

	public String isRomanNumber(int inputNum) {
		
		String []crr= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[]arr= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			while(inputNum>=arr[i]) {
				inputNum=inputNum-arr[i];
				sb.append(crr[i]);
				
			}
		}	
		
		return sb.toString();
	}

}

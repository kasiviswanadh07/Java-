package com.kn.countelements;

public class CountElementsApp {

	public void isCount(String s1) {
		char crr[] = s1.toCharArray();

		
            int count=1;
		for (int i = 0; i < crr.length; i++) {			
			for (int j = 0; j < crr.length - 1; j++) {
				if (crr[j] == crr[j + 1]) {
					count++;
					 if (j + 1 == crr.length - 1) {
						if(crr[j+1]==crr[j]) {
							count++;
						}
						}else {
							System.out.println(crr[j+1]+" "+count);
					}
				}
			}
			
		}bubbleSort(crr);
		
	}
	

	public char[] bubbleSort(char[] crr) {
		
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr.length-1-i; j++) {
				if (crr[j] > crr[j + 1]) {
					int temp = crr[j];
					crr[j] = crr[j + 1];
					crr[j + 1] = (char) temp;
				}
			}
		}
		return crr;

	}

}

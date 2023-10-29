package com.kn.factorial;

public class RecursionFactorial {

	public int findFactorial(int input) {
		if(input==1) {
			return 1;
		}else {
			return input*findFactorial(input-1);
		}	
	}

}

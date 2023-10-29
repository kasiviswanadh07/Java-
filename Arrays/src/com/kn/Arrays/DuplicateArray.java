package com.kn.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
      int[]arr= {3,2,1,2,1};
      
      int k=0;
      for(int i=0;i<arr.length;i++) {
    	  for(int j=(i+1);j<arr.length;j++) {
    		 if(arr[i]==arr[j]) {
    			 k=j;
    			 break;
    		 }  
    	  }
      }System.out.println(arr[k]);
      
	}
}

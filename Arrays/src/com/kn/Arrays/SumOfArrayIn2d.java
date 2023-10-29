package com.kn.Arrays;

public class SumOfArrayIn2d {

	public static void main(String[] args) {
      int arr[][]= {{1,2,3},{4,5,6}};
      int brr[][]= {{4,5,6},{1,2,3}};
      int crr[][]= {{0,0,0,},{0,0,0}};
      
      
      
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<=brr.length;j++) {
//    		  System.out.println("");
    	   crr[i][j]=arr[i][j]+ brr[i][j];
    	   System.out.print(crr[i][j]+" ");
    	  }
      }
	}

}

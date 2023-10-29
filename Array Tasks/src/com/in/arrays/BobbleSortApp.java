package com.in.arrays;

public class BobbleSortApp {
      public int[] BobbleSorting(int arr[]) {
    	  System.out.println(">>>>>>>>After sorting<<<<<<<<<<");
//    	 boolean count=false;
    	  for(int i=0;i<arr.length;i++){
    		 
    		 
    		  int temp=0; int count=0;
    	  for(int j=0;j<arr.length-1-i;j++) {
    		  if(arr[j]>arr[j+1]) {
//    			  temp=arr[j];
//    			  arr[j]=arr[j+1];
//    			  arr[j+1]=temp;
    			  arr[j]=arr[j]+arr[j+1];
    			  arr[j+1]=arr[j]-arr[j+1];
    			  arr[j]=arr[j]-arr[j+1];
    			  count=1;
    		  }
    	  
    	  }if(count==0) {
    		  break;
    	  }
    	  }
    	  
		
    	  return arr;  
      }
}

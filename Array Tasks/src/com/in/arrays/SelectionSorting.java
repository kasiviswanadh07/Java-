package com.in.arrays;

public class SelectionSorting {
     public int[] selectionsort(int []arr) {
    	 for(int i=0;i<arr.length;i++) {
    		 int min=arr[i];
    		 int index=i; 
    		 int temp=0;
    		 for(int j=i+1;j<arr.length;j++) 
    		 {
    			 if(min>arr[j]) {
    				 min=arr[j];
    				 index=j;
    			 }
    		 }
	   temp=arr[i];
    		  arr[i]=min;
    		  arr[index]=temp;
    		 
    	 } 	 
		return arr;
    	 
     }
}

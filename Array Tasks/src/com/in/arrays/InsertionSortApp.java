package com.in.arrays;

public class InsertionSortApp {
//	Method to sort Array Element using insertion sort
     public int[] Sorting(int arr[]) {
    	 int temp=0;
//    	 for(int i=1;i<arr.length;i++) {
//    		 temp=arr[i];
//    		 for(int j=i-1;j>=0;j--) {
//                if(arr[j]>temp && j>=0) {
//                	arr[j+1]=arr[j];
//                	arr[j]=temp;
//                }
//    		 }
//    	 }
    	 for(int i=0;i<arr.length;i++) {
    		 temp=arr[i];
    		 int j=i-1;
    		 while(j>=0 && arr[j]>temp) {
    			 arr[j+1]=arr[j];
    				
    			 j--;
    			 
    		 }arr[j+1]=temp;
    	 }
    	 
		return arr;
	}
}



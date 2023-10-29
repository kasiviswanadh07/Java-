package com.in.arrays;

public class BobbleSorting {
//	call the method
     public int [] Bubble(int arr[]){
    	 for(int i=0;i<arr.length;i++) {
    		 boolean isfound=false;
    		 int temp=0;
    		 for(int j=0;j<arr.length-i-1;j++) {
    			 if(arr[j]>arr[j+1]) {
    				 temp=arr[j];
    				 arr[j]=arr[j+1];
    				 arr[j+1]=temp;
    				 isfound=true;
    			 }
    		 }if(isfound==false) {
    			 break;
    			
    		 }
    	 }
    	 
		return arr;
    	 
     }
}

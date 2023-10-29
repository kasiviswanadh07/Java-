package com.kn.Arrays;

import java.util.Scanner;


public class SearchByLinear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
      int arr[]= new int[scan.nextInt()];
      
      System.out.println("Enter the values of an array");
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=scan.nextInt();
      }
      scan.close();
    
      isfound(arr);
	
	}
  	private static void isfound(int arr[]) {
			
		System.out.println("Enter the element");
      Scanner scan=new Scanner(System.in);
      int element=scan.nextInt();
      boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				
				System.out.println("Element found "+arr[i]);
				flag=true;
				break;
			}
			
			}if(flag==false) {
		System.out.println("Element not found");
		}
			scan.close();
  	}
  	
	}



package com.PatternsYT;

public class Pattern2 {

	public static void main(String[] args) {
//	     for(int i=1;i<=5;i++) {
//	    	 for(int j=1;j<=5;j++) {
//	    		 if(j<=(6-i)) {
//	    			 System.out.print(i);
//	    		 }else {
//	    			 System.out.print(" ");
//	    		 }
//	    	 }System.out.println();
//	     }
	     /*
	     11111
	     2222   sop:i
	     333  
	     44   
	     5    
	     */
		   for(int i=1;i<=5;i++) {
		    	 for(int j=1;j<=5;j++) {
		    		 if(j<=(6-i)) {
		    			 System.out.print(j);
		    		 }else {
		    			 System.out.print(" ");
		    		 }
		    	 }System.out.println();
		     }
		    /*
		    12345
		    1234 
		    123  
		    12   
		    1  */  


		 
	}

}





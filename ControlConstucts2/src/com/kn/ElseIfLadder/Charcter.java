package com.kn.ElseIfLadder;

import java.util.Scanner;

public class Charcter {

	public static void main(String[] args) {
		System.out.println("Enter a Charcter");
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		differentCharcter(c);
		scan.close();
	}

	static void differentCharcter(char c) {
		int Unicode=c;
		if(Unicode>=97 && Unicode<=122){
		       if(Unicode=='a'|| Unicode=='e'||Unicode=='i'||Unicode=='o'||Unicode=='u') {
			       System.out.println("Lowercase Vowel");
		       }else {
		    	   System.out.println("Lowercase Consonant");
		       }
		}else if(Unicode>=65 && Unicode<=90)  {
			if(Unicode=='A'|| Unicode=='E'||Unicode=='I'||Unicode=='O'||Unicode=='U') {
	 			System.out.println("Uppercase Vowel");
			}else {
				System.out.println("Uppercase Cosonant");
			}
		}else if(Unicode>=48 && Unicode<=57) {
				System.out.println("Digit");	
			}else {
				System.out.println("Special Charcter");
			}
		}
		}

		
		
		
		
			
	
		
			
		
	    
	



/*Enter a Charcter
a
Lowercase Vowel
Enter a Charcter
&
Special Charcter

 */
/*Problem Statement 19: You're designing a program for a recruitment agency that determines whether a candidate is suitable for a job role. The program should take years of experience and the candidate's skill level as inputs. A candidate is suitable if they have more than 5 years of experience and a skill level above 7. If the candidate has the required experience, it should then check their skill level. If both conditions are met, it should print "Suitable Candidate".
Sample Input 1: Years of Experience - 6, Skill Level - 8
Sample Output 1: Suitable Candidate
Sample Input 2: Years of Experience - 5, Skill Level - 6
Sample Output 2:*/
package com.kn.NestedIf;

import java.util.Scanner;

public class Designing {

	public static void main(String[] args) {
		System.out.println("Enter the experience and skill level of person");
		Scanner scan =new Scanner(System.in);
		int experienceYears=scan.nextInt();
		int skillLevel=scan.nextInt();
		Designing(experienceYears,skillLevel);
		scan.close();

	}

	static void Designing(int experienceYears, int skillLevel) {
		if(experienceYears>5 && skillLevel>7) {
			System.out.println("Suitable Candidate");
		}else {
			System.out.println("Not Suitable");
		}
		
	}

}
/*Enter the experience and skill level of person
6
8
Suitable Candidate
Enter the experience and skill level of person
5
6
Not Suitable
*/
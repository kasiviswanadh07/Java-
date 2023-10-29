package countvolewsandconsonants;

public class CountVowlesApp {

	public void isCountVowles(String s1) {
		char []crr=s1.toCharArray();
		int upvowel=0;int upcosonenet=0;
		int lowervowel=0; int lowerconsonent=0;
		int special=0; int numbers=0; int space=0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i]>=65&&crr[i]<=90) {
				if(crr[i]=='A'||crr[i]=='E'||crr[i]=='I'||crr[i]=='O'||crr[i]=='U') {
					upvowel++;												
				}else {
					upcosonenet++;				
				}
			}else if(crr[i]>=97&&crr[i]<=122){
				if(crr[i]=='a'||crr[i]=='e'||crr[i]=='i'||crr[i]=='o'||crr[i]=='u') {
					lowervowel++;					
				}else {
					lowerconsonent++;
				}
			}else if(crr[i]==32) {
				space++;
			}else if(crr[i]>='0'&&crr[i]<='9') {
				numbers++;
			}else {
				special++;
				
			}
		}
		
		System.out.println("Spaces :"+space);	
		System.out.println("Upper Case Vowel :"+upvowel);
		System.out.println("Upper case Consonant :"+upcosonenet);
	    System.out.println("Lower Vowel :"+lowervowel);
	    System.out.println("Lower Consonant :"+lowerconsonent);
	    System.out.println("Numbers :"+numbers);
	    System.out.println("Special characters :"+special);
	}
   
}

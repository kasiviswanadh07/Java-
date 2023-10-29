package kom.kn.nonreaptingchar;

public class NonReaptingCharApp {

	public char isNonReapting(String s1) {
		boolean b1=true;
		for(int i=0;i<s1.length();i++) {
			b1=true;
			for(int j=0;j<s1.length();j++) {
				if(i!=j) {
					if(s1.charAt(i)==s1.charAt(j)) {
						b1=false;
					}
				}
			}if(b1) {
				return s1.charAt(i);
			}
		}	
		return s1.charAt(0);		
	}

}

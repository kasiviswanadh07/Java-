package kom.kn.preservespace;

public class SpaceStringApp {

	public String ispreserveSpace(String s1) {
		char []crr=s1.toCharArray();
		char []rrr=new char[s1.length()];
		
		for(int i=0;i<crr.length;i++) {
			if(crr[i]==' ') {
				rrr[i]=crr[i];
			}
		}
		int j=crr.length-1;
		for (int i=0;i<crr.length;i++) {
			if(rrr[i]!=' ') {
				if(crr[j]==' ') {
					j--;
				}
					rrr[j]=crr[i];
					j--;
				
			}
		}	
		
		return new String (rrr);		
	}

}

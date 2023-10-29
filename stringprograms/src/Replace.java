
public class Replace {

	public String Replace(String inputString) {
		

		StringBuffer outputString = new StringBuffer(inputString);

		for (int i = inputString.length() - 1; i >= 0; i--) {
			if (inputString.charAt(i) == ' ') {
				outputString.setCharAt( i, '$');
//			outputString.setCharAt(i,'$');
			}
			
		}return outputString.toString();
			
		
		
	}
}

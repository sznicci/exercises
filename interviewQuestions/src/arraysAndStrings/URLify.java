package arraysAndStrings;

public class URLify {
	
	public static String Urlify(String str, int trueLength) {
		StringBuilder urlifiedStr = new StringBuilder();
		
		for (int i = 0; i < trueLength; i++) {
			if (str.charAt(i) != ' ') {
				urlifiedStr.append(str.charAt(i));
			} else {
				urlifiedStr.append("%20");
			}
		}
		
		return urlifiedStr.toString();
	}

}

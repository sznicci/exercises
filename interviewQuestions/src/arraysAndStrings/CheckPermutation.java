package arraysAndStrings;

import java.util.HashMap;

public class CheckPermutation {

	public static boolean checkPermutation(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		HashMap<Character, Integer> countChar = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {
			if (countChar.get(str1.charAt(i)) == null) {
				countChar.put(str1.charAt(i), 1);
			} else {
				countChar.put(str1.charAt(i), countChar.get(str1.charAt(i)) + 1);
			}
		}
		
		for (int i = 0; i < str2.length(); i++) {
			if (countChar.get(str2.charAt(i)) == null) {
				return false;
			}
			
			if (countChar.get(str2.charAt(i)) > 0) {
				countChar.replace(str2.charAt(i), countChar.get(str2.charAt(i)) - 1);
			} else {
				return false;
			}
		}

		return true;
	}

}

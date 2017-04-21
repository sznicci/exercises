package arraysAndStrings;

import java.util.HashMap;

public class IsUnique {
	
	/*
	 * How about upper-case and lower-case characters? Do they count as unique or not?
	 */
	
	public static boolean isUnique(String str) {
		HashMap<Character, Boolean> strHashMap = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			if (strHashMap.get(str.charAt(i)) == null) {
				strHashMap.put(str.charAt(i), true);
				continue;
			}
			return false;
		}
		
		return true;
	}

}

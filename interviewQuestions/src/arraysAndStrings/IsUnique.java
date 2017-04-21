package arraysAndStrings;

import java.util.HashMap;

public class IsUnique {
	
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

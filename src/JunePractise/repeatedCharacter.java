package JunePractise;

import java.util.HashMap;
import java.util.Map;

public class repeatedCharacter {

	public static void main(String[] args) {

		String str = "Nandikanti Naveen";

		// 1. we have created an HashMap with Character and Integer generics
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// converting string to character array
		char[] charArray = str.toLowerCase().toCharArray();

		// 2. Here the conecpt is, loop through charArray for each character, and if the
		// character is found then count is incremented

		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}

		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}

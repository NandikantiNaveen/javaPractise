package Practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		String s = "Naveen";
		getCharacterCounter(s);
	}

	public static void getCharacterCounter(String s) {
		// Creating HashMap of generics character as key and it's count as Integer
		HashMap<Character, Integer> hashmap = new LinkedHashMap<Character, Integer>();

		// Now converting string to character array
		char c[] = s.toCharArray();

		// Now Iterate through the temp w.r.t hashmap refrence
		for (char temp : c) {
			if (hashmap.containsKey(temp)) {
				hashmap.put(temp, hashmap.get(temp) + 1);
			} else {
				hashmap.put(temp, 1);
			}
		}
		for (Map.Entry entry : hashmap.entrySet()) {
			System.out.println(entry.getKey() + " ----> " + entry.getValue());
		}
	}

}
package JunePractise;

import java.util.*;
import java.util.stream.Collectors;

/**
 * CHARACTER FREQUENCY COUNTER - Multiple Approaches
 * 
 * Problem: Count frequency of each character in a string
 * Interview Tip: Know at least 2-3 approaches
 */
public class CharacterFrequencyApproaches {

	public static void main(String[] args) {
		String str = "Nandikanti Naveen";
		
		System.out.println("========== APPROACH 1: Original with if-else ==========");
		approach1_OriginalIfElse(str);
		
		System.out.println("\n========== APPROACH 2: Using getOrDefault() ==========");
		approach2_GetOrDefault(str);
		
		System.out.println("\n========== APPROACH 3: Using LinkedHashMap (maintains order) ==========");
		approach3_LinkedHashMap(str);
		
		System.out.println("\n========== APPROACH 4: Using Arrays (for lowercase a-z) ==========");
		approach4_ArrayBased(str);
		
		System.out.println("\n========== APPROACH 5: Using Streams (Java 8+) ==========");
		approach5_Streams(str);
		
		System.out.println("\n========== APPROACH 6: Without spaces ==========");
		approach6_WithoutSpaces(str);
		
		// Bonus: Find most frequent character
		findMostFrequentChar(str);
		
		// Direct method calls for quick answers
		System.out.println("\n========== QUICK ANSWERS FOR INTERVIEWS ==========");
		System.out.println("Most frequent char: " + getMostFrequentChar(str));
		Map.Entry<Character, Integer> result = getMostFrequentCharWithCount(str);
		System.out.println("Most frequent char with count: '" + result.getKey() + "' = " + result.getValue());
	}

	/**
	 * APPROACH 1: Original with if-else check
	 * 
	 * PROS: Easy to understand, shows basic logic
	 * CONS: More verbose, redundant key lookup
	 * MEMORY TIP: Good for explaining logic step-by-step in interviews
	 */
	public static void approach1_OriginalIfElse(String str) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		char[] charArray = str.toLowerCase().toCharArray();

		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	/**
	 * APPROACH 2: Using getOrDefault() - CLEANEST & MOST MEMORABLE
	 * 
	 * PROS: Concise, elegant, single line for counting logic
	 * CONS: Requires Java 8+
	 * MEMORY TIP: "getOrDefault is your friend" - reduces code significantly
	 * INTERVIEW ADVANTAGE: Shows you know modern Java methods
	 */
	public static void approach2_GetOrDefault(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		map.forEach((key, value) -> System.out.println(key + " : " + value));
	}

	/**
	 * APPROACH 3: Using LinkedHashMap - MAINTAINS INSERTION ORDER
	 * 
	 * PROS: Output follows insertion order (important for some interviews)
	 * CONS: Slight memory overhead
	 * MEMORY TIP: Use LinkedHashMap when order matters
	 */
	public static void approach3_LinkedHashMap(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char c : str.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		map.forEach((key, value) -> System.out.println(key + " : " + value));
	}

	/**
	 * APPROACH 4: Using Array (for lowercase English letters only)
	 * 
	 * PROS: O(1) space for alphabet, fastest performance
	 * CONS: Only works for a-z characters, need special handling for other chars
	 * MEMORY TIP: "Fast for limited character sets"
	 * INTERVIEW ADVANTAGE: Shows optimization thinking
	 */
	public static void approach4_ArrayBased(String str) {
		int[] frequency = new int[26]; // for 'a' to 'z'

		for (char c : str.toLowerCase().toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				frequency[c - 'a']++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (frequency[i] > 0) {
				System.out.println((char) ('a' + i) + " : " + frequency[i]);
			}
		}
	}

	/**
	 * APPROACH 5: Using Java Streams (Functional Programming)
	 * 
	 * PROS: Very concise, functional style, modern Java
	 * CONS: Less readable for beginners
	 * MEMORY TIP: "Streams make it one-liner"
	 * INTERVIEW ADVANTAGE: Impresses if you know streams well
	 */
	public static void approach5_Streams(String str) {
		str.toLowerCase()
			.chars()
			.boxed()
			.collect(Collectors.groupingBy(c -> (char) c.intValue(), Collectors.counting()))
			.forEach((key, value) -> System.out.println(key + " : " + value));
	}

	/**
	 * APPROACH 6: Excluding spaces
	 * 
	 * Often asked variation: Count characters but ignore spaces
	 * MEMORY TIP: Add a condition to skip spaces or other characters
	 */
	public static void approach6_WithoutSpaces(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toLowerCase().toCharArray()) {
			if (c != ' ') { // Skip spaces
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}

		map.forEach((key, value) -> System.out.println(key + " : " + value));
	}

	/**
	 * BONUS: Find Most Frequent Character
	 * 
	 * Follow-up Interview Question: "Find the character with highest frequency"
	 * This is commonly asked after the basic frequency counting
	 */
	public static void findMostFrequentChar(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char c : str.toLowerCase().toCharArray()) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}

		System.out.println("\n========== FINDING MOST FREQUENT CHARACTER ==========");
		
		// METHOD 1: Using Collections.max() with comparator
		System.out.println("\nMETHOD 1: Using Collections.max()");
		if (!map.isEmpty()) {
			Map.Entry<Character, Integer> maxEntry = Collections.max(map.entrySet(), 
				Comparator.comparingInt(Map.Entry::getValue));
			System.out.println("Most frequent char: '" + maxEntry.getKey() + "' appears " + maxEntry.getValue() + " times");
		}

		// METHOD 2: Using streams
		System.out.println("\nMETHOD 2: Using Streams");
		map.entrySet().stream()
			.max(Comparator.comparingInt(Map.Entry::getValue))
			.ifPresent(entry -> System.out.println("Most frequent char: '" + entry.getKey() + "' appears " + entry.getValue() + " times"));

		// METHOD 3: Manual loop - good for understanding
		System.out.println("\nMETHOD 3: Manual iteration");
		char maxChar = ' ';
		int maxCount = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		System.out.println("Most frequent char: '" + maxChar + "' appears " + maxCount + " times");

		// METHOD 4: Find ALL characters with maximum frequency (in case of ties)
		System.out.println("\nMETHOD 4: All characters with max frequency (handling ties)");
		int maxFreq = Collections.max(map.values());
		List<Character> maxChars = new ArrayList<>();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxFreq) {
				maxChars.add(entry.getKey());
			}
		}
		System.out.println("Characters with max frequency (" + maxFreq + "): " + maxChars);

		// METHOD 5: Using toMap with sorted values
		System.out.println("\nMETHOD 5: Top 3 most frequent characters");
		map.entrySet().stream()
			.sorted((a, b) -> b.getValue().compareTo(a.getValue()))
			.limit(3)
			.forEach(entry -> System.out.println("  '" + entry.getKey() + "': " + entry.getValue()));
	}

	/**
	 * Get Most Frequent Character (Returns the character)
	 * Ready-to-use method for interviews
	 */
	public static char getMostFrequentChar(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char c : str.toLowerCase().toCharArray()) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		
		return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
	}

	/**
	 * Get Most Frequent Character with Count (Returns both char and frequency)
	 */
	public static Map.Entry<Character, Integer> getMostFrequentCharWithCount(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char c : str.toLowerCase().toCharArray()) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		
		return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
	}
}

/**
 * ========== INTERVIEW CHEAT SHEET ==========
 * 
 * Q: "Write a program to count character frequency"
 * 
 * QUICK ANSWER (Approach 2):
 * ---
 * HashMap<Character, Integer> map = new HashMap<>();
 * for(char c : str.toLowerCase().toCharArray()) {
 *     map.put(c, map.getOrDefault(c, 0) + 1);
 * }
 * map.forEach((k,v) -> System.out.println(k + ":" + v));
 * ---
 * 
 * FOLLOW-UP QUESTIONS TO EXPECT:
 * 1. "What if you need to handle case-insensitively?" → Use toLowerCase()
 * 2. "What if you need to exclude spaces?" → Add if(c != ' ') check
 * 3. "How would you find most frequent char?" → Use Collections.max() [SEE BELOW]
 * 4. "Can you do it with arrays?" → Yes, for a-z use int[26]
 * 5. "What's the time complexity?" → O(n) where n = string length
 * 6. "What's the space complexity?" → O(k) where k = unique characters
 * 
 * ========== FINDING MOST FREQUENT CHARACTER (FOLLOW-UP) ==========
 * 
 * ANSWER 1: Collections.max() - MOST COMMON ANSWER
 * ---
 * Map.Entry<Character, Integer> maxEntry = Collections.max(
 *     map.entrySet(), 
 *     Comparator.comparingInt(Map.Entry::getValue)
 * );
 * char mostFrequent = maxEntry.getKey();
 * int frequency = maxEntry.getValue();
 * ---
 * 
 * ANSWER 2: Using Streams (Modern Java)
 * ---
 * map.entrySet().stream()
 *    .max(Comparator.comparingInt(Map.Entry::getValue))
 *    .ifPresent(entry -> System.out.println(entry.getKey()));
 * ---
 * 
 * ANSWER 3: Manual Loop (Shows understanding)
 * ---
 * char maxChar = ' ';
 * int maxCount = 0;
 * for(Map.Entry<Character, Integer> entry : map.entrySet()) {
 *     if(entry.getValue() > maxCount) {
 *         maxCount = entry.getValue();
 *         maxChar = entry.getKey();
 *     }
 * }
 * ---
 * 
 * KEY METHODS TO REMEMBER:
 * ✓ map.getOrDefault(key, defaultValue)
 * ✓ str.toLowerCase().toCharArray()
 * ✓ Collections.max(collection, comparator)
 * ✓ Comparator.comparingInt(Map.Entry::getValue)
 * ✓ map.forEach((k, v) -> action)
 * ✓ LinkedHashMap for maintaining order
 * ✓ Collectors.groupingBy() for streams
 * 
 * COMPLEXITY ANALYSIS:
 * Time:  O(n) for frequency count + O(k log k) or O(k) for finding max
 *        Overall: O(n) where n = string length
 * Space: O(k) where k = number of unique characters (usually ≤ 26 for lowercase)
 */

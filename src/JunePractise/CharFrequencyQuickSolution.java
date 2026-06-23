package JunePractise;

import java.util.*;

/**
 * CHARACTER FREQUENCY - QUICK INTERVIEW SOLUTION
 * 
 * This is the simplified version for quick reference and copy-paste in interviews
 * Contains only the essential methods you need to remember
 */
public class CharFrequencyQuickSolution {

	public static void main(String[] args) {
		String str = "Nandikanti Naveen";
		
		System.out.println("========== PROBLEM 1: Count Character Frequency ==========");
		countCharFrequency(str);
		
		System.out.println("\n========== PROBLEM 2: Find Most Frequent Character ==========");
		char mostFreq = findMostFrequentChar(str);
		System.out.println("Most frequent character: '" + mostFreq + "'");
		
		System.out.println("\n========== PROBLEM 3: Find Most Frequent with Count ==========");
		Map.Entry<Character, Integer> result = findMostFrequentCharWithCount(str);
		System.out.println("Character: '" + result.getKey() + "', Frequency: " + result.getValue());
	}

	/**
	 * MOST IMPORTANT METHOD - Memorize this!
	 * 
	 * Count frequency of each character in a string
	 * 
	 * INTERVIEW ANSWER:
	 * Use HashMap + getOrDefault() to increment count
	 * Time: O(n), Space: O(k) where k = unique characters
	 */
	public static void countCharFrequency(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		// Count each character
		for (char c : str.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Print results
		map.forEach((key, value) -> System.out.println(key + " : " + value));
	}

	/**
	 * Find the character with highest frequency
	 * 
	 * INTERVIEW ANSWER:
	 * Use Collections.max() with Comparator on entry values
	 * Time: O(n) + O(k), Space: O(k)
	 */
	public static char findMostFrequentChar(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		// Count characters (skip spaces)
		for (char c : str.toLowerCase().toCharArray()) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}

		// Find and return the character with max frequency
		return Collections.max(map.entrySet(), 
			Comparator.comparingInt(Map.Entry::getValue)).getKey();
	}

	/**
	 * Find most frequent character with its frequency count
	 * 
	 * Returns: Map.Entry<Character, Integer>
	 * - getKey() = the character
	 * - getValue() = the frequency
	 */
	public static Map.Entry<Character, Integer> findMostFrequentCharWithCount(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toLowerCase().toCharArray()) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}

		return Collections.max(map.entrySet(), 
			Comparator.comparingInt(Map.Entry::getValue));
	}

	/**
	 * Count character frequency excluding spaces
	 * 
	 * Common variation in interviews
	 */
	public static HashMap<Character, Integer> countCharFrequencyExcludeSpaces(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toLowerCase().toCharArray()) {
			if (c != ' ') { // Skip spaces
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}

		return map;
	}

	/**
	 * Find most frequent character using Array (only for a-z)
	 * 
	 * More efficient for only lowercase English letters
	 */
	public static char findMostFrequentCharArray(String str) {
		int[] freq = new int[26]; // 'a' to 'z'

		for (char c : str.toLowerCase().toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				freq[c - 'a']++;
			}
		}

		int maxCount = 0;
		char maxChar = 'a';
		for (int i = 0; i < 26; i++) {
			if (freq[i] > maxCount) {
				maxCount = freq[i];
				maxChar = (char) ('a' + i);
			}
		}

		return maxChar;
	}

	/**
	 * Find top N most frequent characters
	 * 
	 * Follow-up question: "Show top 3 most frequent characters"
	 */
	public static void findTopNFrequent(String str, int n) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toLowerCase().toCharArray()) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}

		// Sort by value (descending) and limit to top n
		map.entrySet().stream()
			.sorted((a, b) -> b.getValue().compareTo(a.getValue()))
			.limit(n)
			.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	}
}

/**
 * ================================================================
 * INTERVIEW MEMORY CHEAT SHEET
 * ================================================================
 * 
 * QUESTION 1: "Count character frequency in a string"
 * ────────────────────────────────────────────────────
 * HashMap<Character, Integer> map = new HashMap<>();
 * for(char c : str.toLowerCase().toCharArray()) {
 *     map.put(c, map.getOrDefault(c, 0) + 1);
 * }
 * 
 * 
 * QUESTION 2: "Find most frequent character"
 * ───────────────────────────────────────────
 * char mostFreq = Collections.max(map.entrySet(), 
 *     Comparator.comparingInt(Map.Entry::getValue)).getKey();
 * 
 * 
 * QUESTION 3: "Get most frequent char with frequency"
 * ────────────────────────────────────────────────────
 * Map.Entry<Character, Integer> result = Collections.max(map.entrySet(), 
 *     Comparator.comparingInt(Map.Entry::getValue));
 * char c = result.getKey();
 * int freq = result.getValue();
 * 
 * 
 * QUESTION 4: "Find first character with max frequency (if ties)"
 * ───────────────────────────────────────────────────────────────
 * Use LinkedHashMap instead of HashMap to maintain insertion order
 * 
 * 
 * QUESTION 5: "Top N most frequent characters"
 * ────────────────────────────────────────────
 * map.entrySet().stream()
 *    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
 *    .limit(n)
 *    .forEach(entry -> { });
 * 
 * 
 * KEY MEMORY POINTS:
 * ─────────────────
 * - getOrDefault(key, defaultValue) replaces if-else
 * - Collections.max() finds maximum element
 * - Comparator.comparingInt(Map.Entry::getValue) compares by value
 * - map.entrySet() use this, not keySet() or values()
 * - LinkedHashMap maintains insertion order
 * 
 * 
 * COMPLEXITY:
 * ──────────
 * Time:  O(n) - where n = string length
 * Space: O(k) - where k = unique characters (max 26 for lowercase)
 * 
 * ================================================================
 */

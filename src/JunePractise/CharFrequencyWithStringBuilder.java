package JunePractise;

import java.util.*;

/**
 * CHARACTER FREQUENCY using StringBuilder and StringBuffer
 * 
 * IMPORTANT NOTE:
 * StringBuilder/StringBuffer are NOT ideal for frequency counting logic,
 * but they can be used to efficiently build output strings instead of
 * using String concatenation in loops (which is very inefficient)
 * 
 * BEST PRACTICE:
 * - Use HashMap/LinkedHashMap for COUNTING logic
 * - Use StringBuilder for BUILDING OUTPUT efficiently
 */
public class CharFrequencyWithStringBuilder {

	public static void main(String[] args) {
		String str = "Nandikanti Naveen";
		
		System.out.println("========== APPROACH 1: With String Concatenation (INEFFICIENT) ==========");
		approach1_StringConcatenation(str);
		
		System.out.println("\n========== APPROACH 2: With StringBuilder (EFFICIENT) ==========");
		approach2_StringBuilder(str);
		
		System.out.println("\n========== APPROACH 3: With StringBuffer (Thread-Safe but Slower) ==========");
		approach3_StringBuffer(str);
		
		System.out.println("\n========== APPROACH 4: StringBuilder for Complex Output ==========");
		approach4_ComplexOutput(str);
		
		System.out.println("\n========== APPROACH 5: StringBuffer for Thread-Safe Scenario ==========");
		approach5_StringBufferThreadSafe(str);
		
		System.out.println("\n========== PERFORMANCE COMPARISON ==========");
		performanceComparison(str);
	}

	/**
	 * APPROACH 1: Using String Concatenation (INEFFICIENT - DON'T USE)
	 * 
	 * WHY BAD:
	 * - Strings are immutable in Java
	 * - Each concatenation creates a new String object
	 * - In a loop, this wastes memory and CPU
	 * 
	 * Example: "a" + "b" + "c" creates 3 String objects internally
	 * String.concat() or + operator creates new objects every time
	 */
	public static void approach1_StringConcatenation(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// INEFFICIENT: This creates many String objects
		String result = "";
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			result += entry.getKey() + " : " + entry.getValue() + "\n"; // Creates new String each time!
		}
		System.out.print(result);
	}

	/**
	 * APPROACH 2: Using StringBuilder (EFFICIENT & RECOMMENDED)
	 * 
	 * WHY GOOD:
	 * - Mutable string class
	 * - append() adds to existing object, doesn't create new ones
	 * - Perfect for building strings in loops
	 * - NOT thread-safe (faster because no synchronization)
	 * 
	 * TIME COMPLEXITY:
	 * - String concat: O(n * m) where n = iterations, m = string length
	 * - StringBuilder: O(n) amortized
	 */
	public static void approach2_StringBuilder(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// EFFICIENT: Single StringBuilder object, reused in loop
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
		}
		System.out.print(sb.toString());
	}

	/**
	 * APPROACH 3: Using StringBuffer (THREAD-SAFE but SLOWER)
	 * 
	 * DIFFERENCES from StringBuilder:
	 * - StringBuffer is synchronized (thread-safe)
	 * - StringBuilder is NOT synchronized (faster)
	 * - All methods are synchronized, causing overhead
	 * 
	 * WHEN TO USE StringBuffer:
	 * - Multi-threaded environments where multiple threads append simultaneously
	 * - Legacy code (StringBuffer existed before StringBuilder)
	 * 
	 * WHEN TO USE StringBuilder:
	 * - Single-threaded code (99% of cases)
	 * - Better performance needed
	 * - Modern Java (StringBuilder introduced in Java 1.5)
	 */
	public static void approach3_StringBuffer(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// StringBuffer with synchronized methods
		StringBuffer sb = new StringBuffer();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
		}
		System.out.print(sb.toString());
	}

	/**
	 * APPROACH 4: Complex Output with StringBuilder
	 * 
	 * Real-world use case: Generating formatted reports
	 * StringBuilder excels at building complex strings
	 */
	public static void approach4_ComplexOutput(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		StringBuilder sb = new StringBuilder();
		
		// Build header
		sb.append("=== CHARACTER FREQUENCY REPORT ===\n");
		sb.append("Input: ").append(str).append("\n");
		sb.append("Unique characters: ").append(map.size()).append("\n");
		sb.append("-".repeat(35)).append("\n");
		
		// Build table
		sb.append("Char | Frequency | Percentage\n");
		sb.append("-".repeat(35)).append("\n");
		
		int total = str.length();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			char c = entry.getKey();
			int count = entry.getValue();
			double percentage = (count * 100.0) / total;
			
			sb.append(String.format("'%c'  |     %2d    |   %.2f%%\n", c, count, percentage));
		}
		
		sb.append("-".repeat(35)).append("\n");
		System.out.print(sb.toString());
	}

	/**
	 * APPROACH 5: StringBuffer for Thread-Safe Scenario
	 * 
	 * Imagine multiple threads adding character counts simultaneously
	 * StringBuffer ensures thread-safety with synchronization
	 */
	public static void approach5_StringBufferThreadSafe(String str) {
		// Note: This is a demonstration. HashMap is NOT thread-safe.
		// In real multithreaded code, use ConcurrentHashMap
		
		Map<Character, Integer> map = new Hashtable<>(); // Thread-safe map
		
		for (char c : str.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// StringBuffer is thread-safe
		StringBuffer sb = new StringBuffer();
		sb.append("Thread-Safe Output:\n");
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
		}
		
		System.out.print(sb.toString());
	}

	/**
	 * APPROACH 6: Efficient Most Frequent Character with StringBuilder
	 */
	public static void findMostFrequentWithStringBuilder(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toLowerCase().toCharArray()) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}

		Map.Entry<Character, Integer> maxEntry = Collections.max(map.entrySet(), 
			Comparator.comparingInt(Map.Entry::getValue));

		StringBuilder sb = new StringBuilder();
		sb.append("Most Frequent Character:\n");
		sb.append("Character: ").append(maxEntry.getKey()).append("\n");
		sb.append("Frequency: ").append(maxEntry.getValue());

		System.out.println(sb.toString());
	}

	/**
	 * Performance Comparison: String Concat vs StringBuilder
	 */
	public static void performanceComparison(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Test 1: String Concatenation
		long start1 = System.nanoTime();
		String result1 = "";
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			result1 += entry.getKey() + " : " + entry.getValue() + "\n";
		}
		long time1 = System.nanoTime() - start1;

		// Test 2: StringBuilder
		long start2 = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
		}
		String result2 = sb.toString();
		long time2 = System.nanoTime() - start2;

		// Test 3: StringBuffer
		long start3 = System.nanoTime();
		StringBuffer sbuf = new StringBuffer();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			sbuf.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
		}
		String result3 = sbuf.toString();
		long time3 = System.nanoTime() - start3;

		System.out.println("\nString Concatenation Time: " + time1 + " ns");
		System.out.println("StringBuilder Time:        " + time2 + " ns");
		System.out.println("StringBuffer Time:         " + time3 + " ns");
		System.out.println("\nStringBuilder is " + (time1 / time2) + "x faster than String concatenation");
		System.out.println("StringBuffer is " + (time3 / time2) + "x slower than StringBuilder (due to synchronization)");
	}
}

/**
 * ================================================================
 * STRING BUILDING IN JAVA - QUICK REFERENCE
 * ================================================================
 * 
 * 1. STRING CONCATENATION (+ operator) - INEFFICIENT
 *    ────────────────────────────────
 *    String s = "Hello";
 *    s = s + " World";  // Creates new String object!
 *    
 *    Problem: Each += creates new String (O(n) per operation)
 *    In loop: O(n²) complexity!
 * 
 * 
 * 2. STRING.CONCAT() METHOD - STILL INEFFICIENT
 *    ──────────────────────
 *    String s = "Hello";
 *    s = s.concat(" World");  // Also creates new String
 *    
 *    Same inefficiency as + operator
 * 
 * 
 * 3. STRINGBUILDER - RECOMMENDED FOR SINGLE-THREADED (BEST CHOICE)
 *    ──────────────
 *    StringBuilder sb = new StringBuilder();
 *    sb.append("Hello").append(" ").append("World");
 *    String result = sb.toString();
 *    
 *    Pros: Fast, mutable, NOT thread-safe (faster)
 *    Cons: NOT thread-safe
 *    Use: 99% of cases, especially in loops
 * 
 * 
 * 4. STRINGBUFFER - THREAD-SAFE (USE ONLY IF NEEDED)
 *    ───────────────
 *    StringBuffer sb = new StringBuffer();
 *    sb.append("Hello").append(" ").append("World");
 *    String result = sb.toString();
 *    
 *    Pros: Thread-safe (synchronized)
 *    Cons: Slower due to synchronization overhead
 *    Use: Multi-threaded scenarios (rare)
 * 
 * 
 * KEY METHODS FOR BOTH:
 * ────────────────────
 * - append(any) - Add to end
 * - insert(index, any) - Insert at position
 * - replace(start, end, string) - Replace substring
 * - delete(start, end) - Delete characters
 * - reverse() - Reverse the string
 * - length() - Get length
 * - capacity() - Get internal buffer capacity
 * - toString() - Convert to String
 * 
 * 
 * COMPARISON TABLE:
 * ─────────────────
 * ┌──────────────┬────────────┬───────────────┬──────────────┐
 * │   Class      │ Mutable    │ Thread-Safe   │    Speed     │
 * ├──────────────┼────────────┼───────────────┼──────────────┤
 * │ String       │ Immutable  │ Yes (implicit)│ SLOW (concat)│
 * │ StringBuilder│ Mutable    │ NO            │ FASTEST      │
 * │ StringBuffer │ Mutable    │ YES (sync)    │ SLOW         │
 * └──────────────┴────────────┴───────────────┴──────────────┘
 * 
 * 
 * REAL-WORLD EXAMPLE - WHEN TO USE EACH:
 * ──────────────────
 * 
 * // AVOID THIS - String Concatenation in Loop
 * String result = "";
 * for(int i = 0; i < 1000; i++) {
 *     result += i + ",";  // Creates 1000 new String objects! VERY SLOW
 * }
 * 
 * // USE THIS - StringBuilder in Loop (BEST)
 * StringBuilder sb = new StringBuilder();
 * for(int i = 0; i < 1000; i++) {
 *     sb.append(i).append(",");  // Reuses same object. FAST!
 * }
 * String result = sb.toString();
 * 
 * // USE STRINGBUFFER ONLY IF MULTIPLE THREADS APPEND SIMULTANEOUSLY
 * StringBuffer sb = new StringBuffer();
 * executor.execute(() -> sb.append("Thread1"));
 * executor.execute(() -> sb.append("Thread2"));
 * 
 * 
 * RULE OF THUMB:
 * ──────────────
 * Use STRING + for:           Single concatenation, not in loops
 * Use STRINGBUILDER for:      Building strings, especially in loops (DEFAULT CHOICE)
 * Use STRINGBUFFER for:       Multi-threaded append scenarios (RARE)
 * 
 * ================================================================
 */

package Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InterviewPrep {

	public static void main(String[] args) {
//		firstNFibanocciSeries();
		occuranceOfChars("aabbcc");
	}

	public static void firstNFibanocciSeries() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of: ");
		int n = sc.nextInt();
		int f1 = 0, f2 = 1, next;
		if (n < 1)
			return;
		for (int i = 1; i <= n; i++) {
			System.out.println(f1 + " ");
			next = f1 + f2;
			f1 = f2;
			f2 = next;
		}
	}

	public static void occuranceOfChars(String s) {
		
		// Create a hashmap of generics character and interger as counter which given
		// repeated Characters
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] c = s.toCharArray();
		for (char e : c) {
			if (map.containsKey(e)) {
				map.put(e, map.get(e) + 1);
			} else {
				map.put(e, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}
}

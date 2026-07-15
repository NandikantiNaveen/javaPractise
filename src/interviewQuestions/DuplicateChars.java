package interviewQuestions;

import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class DuplicateChars {

	public static void main(String[] args) {

		DuplicateChars d = new DuplicateChars();
		d.sudoCode();
//		d.duplicateCharacters();
//		d.removeDuplicateCharacters();
//		removeDuplicates();
	}

	public void sudoCode() {

		String s = "Naveen";

		char c[] = s.toLowerCase().toCharArray();
		System.out.println("The Given String:" + s);
		System.out.println("The length of Character Array:" + c.length);
		for (int i = 0; i < c.length; i++) {
			int count = 1;
			if (c[i] == '0') continue;
			// int temp=0;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					c[j]=0;
				}
			}

			if (count > 0) 
				System.out.println("Duplicate Character: " + c[i] + " Count: " + count);

		}

	}

	public void duplicateCharacters() {
		String s = "Nandikanti";
		int count = 0;
		System.out.println("The Length of String:" + s.length());
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					System.out.println("Duplicate Character is:" + s.charAt(i));

				}
				System.out.println("The Number of Duplicate Characters:" + count);
			}
		}
	}

	public void removeDuplicateCharacters() {
		String str = "Naveen";
		int count = 0;
		StringBuilder sb = new StringBuilder(str);
	//	StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < sb.length(); i++) {
			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(i);
					count++;
					System.out.println("Duplicate Character is:" + sb.charAt(i));
				}
				System.out.println("The Number of Duplicate Characters:" + count);
				System.out.println("The final string:"+sb);
			}
		}
	}
	
	public static String removeDuplicates() {
		String str = "Naveen";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        System.out.println("The set values are:"+set.toString());

        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        System.out.println("The set values are:"+sb.toString());

        return sb.toString();
    }

}

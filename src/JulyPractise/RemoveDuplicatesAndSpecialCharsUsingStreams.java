package JulyPractise;

import java.util.LinkedHashSet;

public class RemoveDuplicatesAndSpecialCharsUsingStreams {

	public static void main(String[] args) {
		String str = "1112drui217$%^droyp(*09";
		
		// LinkedHashSet is better approach for this problem
		
		// Step1: Create a LinkedHashSet of Character generic first
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		// Step2: convert string to char array 
		
		char[] c = str.toCharArray();
		
		// loop through char array and add to LinkedHashSet.
		
		for(char ch:c) {
			if(Character.isLetterOrDigit(ch))
				set.add(ch);
		}
		
		System.out.println(set.toString().replaceAll("[^a-zA-Z0-9]", ""));


	}

}

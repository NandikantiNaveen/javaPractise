package Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringRevUsingCollections {

	public static void main(String[] args) {
		String s = "Naveen";
		System.out.println(revUsingCollection(s));
	}

	public static String revUsingCollection(String s) {
		// return the same string if given string is null or empty
		if (s == null || s.equals("")) {
			return s;
		}
		// create new ArrayList of generic Character
		List<Character> list = new ArrayList<Character>();
		
		
		// loops through the string elements by converting into CharArray and add each character to list
		for (char c : s.toCharArray()) {
			list.add(c);
		}
		
		// Now reverse the list using inbuild method reverse()
		Collections.reverse(list);

		// Now again convert the Arraylist into String using StringBuilder
		StringBuilder sb = new StringBuilder(list.size());
		for(Character c:list) {
			sb.append(c);
		}
		return sb.toString();

	}

}

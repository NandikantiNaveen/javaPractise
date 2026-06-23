package JunePractise;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesWithSets {

	public static void main(String[] args) {
		String str = "112drui217$%^droyp(*09";
		
		StringBuilder sb = new StringBuilder();
		Set<Character> unique = new HashSet<>();
		
		for (char c:str.toCharArray()) {
			if(!unique.contains(c)) {
				unique.add(c);
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}

package JulyPractise;

import java.util.stream.Collectors;

public class RemoveDuplicatesAndSpecialChars {

	public static void main(String[] args) {
		String str = "1112drui217$%^droyp(*09";

		String result = str.chars() // Converts string into a stream of ASCII/Unicode values.
				.mapToObj(ch -> (char) ch) // Converts integer values back to characters.
				.filter(Character::isLetterOrDigit) // Keeps only letters and digits.
				.distinct() // duplicates removed
				.map(String::valueOf).collect(Collectors.joining());

		System.out.println(result);

		String newStr = str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.toCollection(java.util.LinkedHashSet::new)).stream().map(String::valueOf)
				.collect(Collectors.joining());

		System.out.println(newStr);
	}
	
	public void removeDuplicates(String str) {
		str.chars()
		.mapToObj(ch->(char)ch)
		.filter(Character::isLetterOrDigit)
		.distinct()
		.map(String::valueOf).collect(Collectors.joining());
	}

}

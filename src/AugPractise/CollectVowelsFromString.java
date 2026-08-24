package AugPractise;

public class CollectVowelsFromString {

	public static void main(String[] args) {
		// getVowelsUsingRegEx("Automation Testing");
		// getVowelsUsingStreams("Automation Testing");
		// getVowelMostGenericApproach(("Automation Testing"));
		getConsonants("Automation Testing");
		getConsonantsUsingRegEx(("Automation Testing"));
	}

	public static void getVowelsUsingRegEx(String str) {
		String vowels = str.replaceAll("[^AEIOUaeiou]", "");
		System.out.println(vowels);
	}
	public static void getConsonantsUsingRegEx(String str) {
		String vowels = str.replaceAll("[AEIOUaeiou]", "");
		System.out.println(vowels);
	}

	public static void getVowelsUsingStreams(String str) {
		String vowels = str.chars().mapToObj(c -> String.valueOf((char) c)).filter(ch -> "AEIOUaeiou".contains(ch))
				.reduce("", String::concat);
		int countOfVowels = str.chars().mapToObj(c -> String.valueOf((char) c)).filter(ch -> "AEIOUaeiou".contains(ch))
				.reduce("", String::concat).length();
		System.out.println("Vowels in given String are" + " " + vowels + " " + "and their count" + " " + countOfVowels);
	}

	public static void getVowelMostGenericApproach(String str) {
		String vowels = "";
		for (char ch : str.toCharArray()) {
			if ("AEIOUaeiou".indexOf(ch) != -1) {
				vowels = vowels + ch;
			}
		}
		System.out.println(vowels);
	}

	public static void getConsonants(String str) {
		String consonants = "";
		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch) && !"AEIOUaeiou".contains(String.valueOf(ch))) {
				consonants += ch;
			}
		}
		System.out.println(consonants);
	}
}

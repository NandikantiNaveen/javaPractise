package Practise;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		String s ="%#$@%Naveen#*&^!123";
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		String s2 = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s2.toUpperCase());

	}

}

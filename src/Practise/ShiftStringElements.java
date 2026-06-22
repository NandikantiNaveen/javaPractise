package Practise;

public class ShiftStringElements {

	public static boolean isVowel(char x) {
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' 
			|| x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
			return true;
		else
			return false;
	}
	public static void shiftVowelOfString(String s) {
		String vowels, consonents;
		String finalStr;
		vowels = consonents = finalStr = "";
		for (int i=0;i<s.length();i++) {
			if(isVowel(s.charAt(i))) {
				vowels = vowels+s.charAt(i);
			}
			else
			{
				consonents = consonents+s.charAt(i);
			}
		}
		finalStr = consonents+vowels;
		System.out.println(finalStr);
	}

	public static void main(String[] args) {
		String s = "Vowels";
//		System.out.println(isVowel(s));
		shiftVowelOfString(s);
	}

}

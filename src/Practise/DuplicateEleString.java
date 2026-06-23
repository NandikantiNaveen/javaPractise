package Practise;

public class DuplicateEleString {

	public static void main(String[] args) {
		String s = "Nav123en";
		int digitCounter = 0;
		char c[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
			if (Character.isDigit(c[i])) {
				digitCounter++;
			}
		}
		System.out.println("No. of digits in string "+" "+s+"are"+" "+digitCounter);
	}

}

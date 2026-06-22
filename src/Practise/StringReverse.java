package Practise;

public class StringReverse {
	String t = "";
	public static void main(String[] args) {
		StringReverse obj = new StringReverse();
		obj.reverseString("LIRIL");

	}

	public void reverseString(String s) {
		System.out.println("The length of string:" + s.length());
		
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		System.out.println("The Reverse String:" + t);
		if (s.equalsIgnoreCase(t))
			System.out.println("Given String is Palindrome");

		else {
			System.out.println("Given String is not Palindrome");
		}

	}

}

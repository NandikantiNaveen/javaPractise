package Practise;

public class DuplicateChars {

	public static void main(String[] args) {

		DuplicateChars d = new DuplicateChars();
//		d.sudoCode();
		d.duplicateCharacters();
	}

	public void sudoCode() {

		String s = "Naveen";
		int count = 0;
		int temp=0;
		char c[] = s.toCharArray();
		System.out.println("The Given String:" + s);
		System.out.println("The length of Character Array:" + c.length);
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (c[i] == c[j]) {
					count++;
					break;
				}
			}
			System.out.println("Duplicate Character is:" + c[i] +count);
		}
		
	}

	public void duplicateCharacters() {
		String s = "Nandikanti";
		System.out.println("The Length of String:" + s.length());
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					System.out.println("Duplicate Characters are:" + s.charAt(i));
				}
			}
		}
		System.out.println("No.of Duplicate Characters:"+count);
	}
}

package Practise;

public class RemoveSpaces {

	public static void main(String[] args) {

		String s = "India is my Country";
		String newString = s.replaceAll("\\s", "");
		System.out.println(newString);

		StringBuffer sb = new StringBuffer();

		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
//			if((c[i]!= '') && (c[i]='\t')) {
			sb.append(c[i]);
//			}
		}
	}

}

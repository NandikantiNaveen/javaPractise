package JunePractise;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Monday";
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
	}

}

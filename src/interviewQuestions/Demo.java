package interviewQuestions;

public class Demo {

	public static void main(String[] args) {
		String s = "ASDF12";
		String sub = "CA";

		for (int i = 0; i < s.length() - 1; i++) {
			int l = (int) s.toLowerCase().charAt(i);
			int r = (int) s.toLowerCase().charAt(i + 1);
			if (r - l == 1) {
				System.out.println("Invalid");
				break;
			}
		}
		System.out.println("Valid");

//		int fidx = s.indexOf(sub);
//		System.out.println(fidx);
//		
//		int sidx = s.indexOf(sub,fidx+1);
//		System.out.println(sidx);
//		
//		int tidx = s.indexOf(sub, sidx+1);
//		System.out.println(tidx);
	}

}

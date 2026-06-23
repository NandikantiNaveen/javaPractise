package interviewQuestions;

import java.util.Arrays;

public class Practise {

	public static void main(String[] args) {

		String str = "CAABCCAFCAGCA";
		String sub = "CA";
//		int index = 0;
//		while (true) {
//			index = str.indexOf(sub, index);
//			if (index < 0) {
//				break;
//			}
//			System.out.println(index);
//			index++;
//		}
		String[] arr = str.split(sub);
		System.out.println(Arrays.toString(arr));
		int l = 0;
		for (String s : arr) {
			l += s.length() ;
			System.out.println(l);
			l +=  sub.length();
		}
	}

}

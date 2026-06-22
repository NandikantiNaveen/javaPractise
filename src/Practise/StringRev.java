package Practise;

import java.util.ArrayList;
import java.util.List;

public class StringRev {

	public static void main(String[] args) {
		String s = "Naveen";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
	
	List<String> listString = new ArrayList<String>();

}

package interviewQuestions;

import java.util.HashMap;

public class HashMapConcpet2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		String s[] = new String[3];
		s[0]="naveen";
		s[1]="John";
		s[2]="Peter";
		for(int i=0;i<s.length;i++) {
			hm.put(s[i], s.length-i);
		}
		System.out.println("The HashMap elements are:"+hm);
		
			
		
		
	
	}

}

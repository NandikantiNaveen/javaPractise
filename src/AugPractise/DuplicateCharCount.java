package AugPractise;

import java.util.HashMap;

public class DuplicateCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Nandikanti Naveen";
		char[] charArray = str.toLowerCase().toCharArray();
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		for(char c:charArray) {
			if(countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
				}
			else {
				countMap.put(c, 1);
			}
		}
		countMap.forEach((key,value)->System.out.println(key+" : "+value));;
	}

}

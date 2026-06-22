package interviewQuestions;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<String, Integer > hashMap = new HashMap();
		hashMap.put("Naveen", 10);
		hashMap.put("John", 20);
		hashMap.put("Navin", 30);
		
		System.out.println("The Size of Hash Map is"+hashMap.size());
		System.out.println(hashMap);
		
		if(hashMap.containsKey("Navin")) {
			int k = hashMap.get("Naveen");
			System.out.println("The value for key:"+k);
		}

		

	}

}

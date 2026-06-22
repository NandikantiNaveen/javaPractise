package collections;

import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		
		Map<String, Integer> number = new TreeMap<>();
		number.put("One", 1);
		number.put("Two", 2);
		number.put("Three", 5);
		number.put("Four", 6);
		
		System.out.println(number);
		
		for(Map.Entry<String, Integer> e:number.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
//		
//		for(String e:number.keySet()) {
//			System.out.println(e);
//		}
//		for(Integer i:number.values()) {
//			System.out.println(i);
//		}
	}

}

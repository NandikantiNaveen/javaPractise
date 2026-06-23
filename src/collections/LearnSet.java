package collections;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>();
//		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		
		Set<Integer> set = new TreeSet<>();

		set.add(40);
		set.add(60);
		set.add(60);
		set.add(90);
		set.add(10);
		set.add(20);
		
		
		System.out.println(set);
		
		set.remove(60);
		
		System.out.println(set);
		System.out.println(set.contains(100));
		System.out.println(set.isEmpty());
		
	}

}

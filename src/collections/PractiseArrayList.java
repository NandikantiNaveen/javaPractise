package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PractiseArrayList {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>(); // creates an empty array
		for (int i = 0; i < 10; i++) {
			numList.add(i);
		}
		System.out.println(numList);

		numList.remove(0);

		System.out.println(numList);
		
		numList.remove(Integer.valueOf(9));
		
		System.out.println(numList);
		
//		numList.clear();
		
		numList.set(2, 1000);

		System.out.println(numList);
		
		System.out.println(numList.contains(1000));
		
		for(int j=0;j<numList.size();j++) {
			System.out.println("The elements in the list:"+numList.get(j));
		}
		System.out.println("************************************");
		for(Integer e:numList) {
			System.out.println("The element in the list:"+e);
		}
		System.out.println("************************************");
		Iterator<Integer> it = numList.iterator();
		while(it.hasNext()) {
			System.out.println("The elements in the list:"+it.next());
		}
		
	}

}

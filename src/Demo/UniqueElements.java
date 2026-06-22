package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElements {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>();

//		Integer a[] = {1,2,3,3,4,5,5,6,7};
//		unqElementUsingStreams(a);
		unqElementUsingArrayList(numberList);

	}

	public static void unqElementUsingStreams(Integer a[]) {
		ArrayList<Integer> numlist = new ArrayList<Integer>(Arrays.asList(a));
		List<Integer> unqiueList = numlist.stream().distinct().collect(Collectors.toList());
		System.out.println(unqiueList);
	}

	public static void unqElementUsingArrayList(List<Integer> numList) {
		numList.add(1);
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(3);
		numList.add(12);
		numList.add(4);
		numList.add(13);
//		System.out.println(numList);
		for (int i = 0; i < numList.size(); i++) {
			for (int j = i + 1; j < numList.size(); j++) {
				if(numList.get(i)==numList.get(j)) {
					numList.remove(i);
				}
			}

		}
		System.out.println(numList);
//		numList.removeAll(numList.stream().distinct().collect(Collectors.toList()));
//		System.out.println(numList);

	}

}

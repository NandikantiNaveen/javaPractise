import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class NonRepElem {

	public static void main(String[] args) {

		Integer a[] = { 1, 1, 2, 1, 3, 1, 2, 4, 2, 6, 7 };
		//O/P {3,4,6,7}
		System.out.println("The Give array length:"+a.length);
		
		nonRepeatElem(a);
		
		List<Integer> list = new ArrayList<Integer> (Arrays.asList(a));
		//List<Integer> dups = new ArrayList<Integer>(list);
		
		for(Iterator<Integer> e = list.iterator();e.hasNext();) {
			int beforeSize = list.size();
			int element = e.next();
			
			list.removeAll(Collections.singletonList(element));
			int afterSize = list.size();
			if(beforeSize - afterSize == 1)
				System.out.println(element);
		}

//		Set<Integer> set = new HashSet<>(Arrays.asList(a));
//		List<Integer> temp = new ArrayList<>(Arrays.asList(a));
//
//		List<Integer> uniqueValues = new ArrayList<>();
//		
//		for(Integer e : temp) {
//			List<Integer> temp = new ArrayList<>(Arrays.asList(a));
//			int initSize = temp.size();
//			
//			temp.removeAll(Collections.singletonList(e));
//			int afterSize = temp.size();
//			if(initSize - afterSize == 1) {
//				uniqueValues.add(e);
//			}
//		}
//		System.out.println("Unique Values: " + uniqueValues);
		
//	List<Integer> numList = new ArrayList<Integer>(Arrays.asList(a));
//	List<Integer> nonRepEleList = numList.stream().distinct().collect(Collectors.toList());
//	System.out.println(nonRepEleList);

	}
	
	public static void nonRepeatElem(Integer a[]){
		List<Integer> dups = new ArrayList<>();
		List<Integer> numList = new ArrayList<Integer>(Arrays.asList(a));
//		numList.sort(Comparator.naturalOrder());
		System.out.println("The Sored List: " + numList);
		List<Integer> nonRepList = new ArrayList<Integer>();
		System.out.println(numList);
		int len = numList.size();
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (numList.get(i) == numList.get(j)) {
					dups.add(numList.get(i));
					break;
					//numList.remove(i);
					//len--;
				}
			}
		}
		System.out.println("Duplicates: " + dups);
		System.out.println("After Removal: " + numList);
		for(Integer e : dups) {
			numList.removeAll(Collections.singletonList(e));
		}
		System.out.println("Non Repeating List: " + numList);
		System.out.println("No. of Repeating elements: " + numList.size());
	}

}
 
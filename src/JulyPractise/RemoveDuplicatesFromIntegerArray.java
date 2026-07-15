package JulyPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////		Integer num[] = {1,2,3,4,5,6,6,4,2,9,10};
//
//		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(num));
//		
//		System.out.println(numList.stream().distinct().collect(Collectors.toList()));
//		
//		System.out.println("------------------------------------------------");
//		
//		int marks[] = {36,38,50,89,99,99};
//		ArrayList<Integer> marksList = new ArrayList<Integer>();
//		
//		for(int n:marks) {
//			marksList.add(n);
//		}
//		
//		List<Integer> newMarks = marksList.stream().distinct().collect(Collectors.toList());
//		System.out.println(newMarks);
//		
//		System.out.println("------------------------------------------------");
//		
//		int numbers[] = {36,38,50,50,89,99,99};
//		List<Integer> numList= Arrays.stream(numbers).boxed().distinct().collect(Collectors.toList());
//		System.out.println(numList);

		int num = 12345;
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev*10+ rem;
			num = num / 10;
		}
		System.out.println(rev);

	}

}

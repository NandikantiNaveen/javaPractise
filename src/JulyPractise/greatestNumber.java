package JulyPractise;

import java.util.Arrays;
import java.util.Comparator;

public class greatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {23,10,22,33,44,44,50,9,1,0};
		int n=3;
		Integer nthLargest = Arrays.stream(num)
				.boxed()
					.distinct()
						.sorted(Comparator.reverseOrder())
							.skip(n-1)
								.findFirst()
									.orElse(null);
		System.out.println(n +" largest number "+" "+nthLargest);						

	}
	
	public void getLargestNumber(int num[]) {
		// I need 3rd largest element from the array.
		int n=3;
		Integer nthLargest = Arrays.stream(num)//IntStream
		.boxed() // converts primitive steam into stream of wraper object
		.distinct() // removed duplicates
		.sorted(Comparator.reverseOrder())
		.skip(n-1)
		.findFirst()
		.orElse(null);
	}

}

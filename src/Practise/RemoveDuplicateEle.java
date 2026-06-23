package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateEle {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 6));
		Set<Integer> setWithOutDuplicates = numList.stream().collect(Collectors.toSet());
		List<Integer> listWithOutDuplicates = numList.stream().distinct().collect(Collectors.toList());
		System.out.println(setWithOutDuplicates);
		System.out.println(listWithOutDuplicates);

	}

}

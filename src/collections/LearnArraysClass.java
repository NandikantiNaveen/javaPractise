package collections;

import java.util.Arrays;

public class LearnArraysClass {

	public static void main(String[] args) {
		
		int[] number = {11,2,3,3,4,5,6,6,9};
		Arrays.sort(number);
		for(int num:number) {
			System.out.println(num);
		}

	}

}

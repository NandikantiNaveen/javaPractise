package Practise;

import java.util.stream.IntStream;

public class Print1to100WithOutUsingLoops {
	
	/*
	 * Printing 1 to 100 without using loops
	 * 1. Using recursion
	 * 2. Using java streams
	 */
	

	public static void main(String[] args) {
//		IntStream.range(1, 101).forEach(e -> System.out.println(e));
		printNum(1);
	}
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
		
	}
}

package Practise;

import java.util.Arrays;

public class ShiftArrayElements {

	public static int[] shiftZerosToRight(int a[]) {
		int l = a.length;
		if (a.length == 1) {
			return a;
		}
		int num[] = new int[a.length];
//		int count = 0;
		
		for (int iterator : a) {
			if (iterator != 0) {
				num[l-1] = iterator;
				l--;
			}
		}
		return num;
	}
	public static int[] shiftZerosToLeft(int a[]) {
		int k = a.length;
		if (a.length == 1) {
			return a;
		}
		int num[] = new int[k];
		int count = 0;
		
		for (int iterator : a) {
			if (iterator != 0) {
				num[count] = iterator;
				count++;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 0, 3, 0, 4, 0 };
		System.out.println(Arrays.toString(shiftZerosToRight(a)));
		System.out.println(Arrays.toString(shiftZerosToLeft(a)));
	}

}

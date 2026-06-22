package Practise;

import java.util.Arrays;

public class ShiftNonZeroEle {

	public static void main(String[] args) {
		int a[] = { 1, 3, 0, 4, 0, 6 };

		System.out.println(Arrays.toString(shiftZeroToLeft(a)));
		System.out.println(Arrays.toString(shiftZeroToRight(a)));

		
	}

	public static int[] shiftZeroToLeft(int num[]) {

		int l = num.length;
		if (l == 1)
			return num;
		int temp[] = new int[num.length];
		for (int iterator : num) {
			if (iterator != 0) {
				temp[l - 1] = iterator;
				l--;
			}
		}
		return temp;
	}
	public static int[] shiftZeroToRight(int num[]) {
		int  count = 0;
		int l = num.length;
		if(l==1)
			return num;
		int temp[] = new int[num.length];
		for(int iterator:num) {
			if(iterator!=0) {
				temp[count]=iterator;
				count++;
			}
		}
		return temp;
	}
	

}

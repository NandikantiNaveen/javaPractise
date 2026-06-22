package Practise;

public class MissingArrayElement {

	public static void main(String[] args) {
		int num[] = { 0, 1, 2, 4, 5 };
		System.out.println(missingArrayElement(num));
	}

	public static int missingArrayElement(int[] num) {
//		int xor = 0;
//		for (int i = 0; i < num.length; i++) {
//			if (i < num.length)
//				xor = xor ^ num[i];
//			xor ^= i;
//		}
//		return xor;

		int n = num.length;
		int expSum = ((n) * (n + 1)) / 2;
		int inputSum = 0;
		for (int i : num) {
			inputSum += i;
		}
		return expSum - inputSum;
	}

}

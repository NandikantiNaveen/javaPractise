package Practise;

public class SumOfDiagonalElements {

	public static void main(String[] args) {
		int num[][] = { { 1, 2, 3, 4 }, { 2, 4, 4, 4 }, { 1, 3, 4, 5 }, { 4, 5, 6, 9 } };
		diagonalSum(num, 4);
	}

	public static void diagonalSum(int a[][], int n) {

		int firstSum = 0;
		int secSum = 0;
		int thirdSum = 0;

		for (int i = 0, k=n-1; i < n; i++,k--) {
			firstSum = firstSum + a[i][i];
			secSum = secSum + a[i][k];
//			for (int j = 0; j < n; j++) {
////				if (i == j) {
////					firstSum = firstSum + a[i][j];
////				}
//				if ((i + j) == (n - 1)) {
//					secSum = secSum + a[i][j];
//				}
//			}

		}
		System.out.println("The Sum of diagonal elements:" + firstSum);
		System.out.println("The Sum of diagonal elements:" + secSum);
		System.out.println("The Sum of diagonal elements:" + thirdSum);

	}

}

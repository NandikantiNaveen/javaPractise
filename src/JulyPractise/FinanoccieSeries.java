package JulyPractise;

import java.util.Scanner;

public class FinanoccieSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Give the Series: " + n);
		int n1 = 0, n2 = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println("Fibanocci Series is " + n1);
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}

}

package interviewQuestions;

public class FindPairs{
public static void getPairs(int a[], int x) {
	int sum = x;
	boolean flag = false;
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == sum) {
					System.out.println("The pairs are:" + a[i] + "," + a[j]);
					flag=true;
				}
			}
		}
		if(!flag) {
			System.out.println("Pairs are not found");
		}
	
	}
public static void main(String args[]) {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//	FindPairs obj = new FindPairs();
	getPairs(a, 10);
}
}

package interviewQuestions;

public class PrimeNumber {

	// 2 is the lowest prime, next is 3
	
	public static void getPrimesFromArray(int a[]) {
		int prime[] = new int[a.length];
		int nonPrime[]=new int[a.length];
		for (int j = 0; j < a.length; j++) {
				if (isPrime(a[j])) {
					prime[j]=a[j];
					System.out.println("Prime Elements are:"+prime[j]);
				}
				else{
				nonPrime[j]=a[j];
				System.out.println("Non-Prime Elements are:"+nonPrime[j]);
			}
		}
	}
	public static void getPrimeNumbers(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int a[]=new int[] {2,4,5,6,10,7};
		getPrimesFromArray(a);
//		getPrimeNumbers(10);
		
//		System.out.println(isPrime(0));
	}

}

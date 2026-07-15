package JulyPractise;

public class firstNPrimeNumbers {
	public static void main(String args[]) {
		int n = 10, num = 2, count = 0;
		
		while (count < n) {
			boolean isPrime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
				if (isPrime) {
					System.out.println(num + " ");
					count++;
				}
				num++;
		}
	}
}

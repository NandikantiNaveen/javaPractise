package Practise;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		fact = factRecursion(num) * 1;
		System.out.println("Factorial of " + num + " is: " + fact);
	}

	public static int factRecursion(int num) {
		if (num == 0) {
			return 1;
		} else {
			return (num * factRecursion(num - 1));
		}

	}

}

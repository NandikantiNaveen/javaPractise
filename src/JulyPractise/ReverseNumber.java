package JulyPractise;

public class ReverseNumber {

	public static void main(String[] args) {

		int originalNumber = 121;
		int number = originalNumber;
		int rev = 0;

		while (number != 0) {
			int rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}
		System.out.println(rev);
		if (originalNumber == rev) {
			System.out.println("Given" + " " + originalNumber + " " + "is Palindrome number");
		} else {
			System.out.println("Given" + " " + originalNumber + " " + "is  not Palindrome number");
		}

	}

}

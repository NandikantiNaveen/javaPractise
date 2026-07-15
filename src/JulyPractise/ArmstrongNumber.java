package JulyPractise;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int orginalNumber = 150;
		int number = orginalNumber;
		int rev = 0;
		while (number != 0) {
			int rem = number % 10;
			rev = rev + rem * rem * rem;
			number = number / 10;
		}
		System.out.println(rev);
		if (orginalNumber == rev) {
			System.out.println("Given" + " " + orginalNumber + " " + "is Armstrong number");
		} else {
			System.out.println("Given" + " " + orginalNumber + " " + "is  not Armstrong number");
		}

	}
}

package AugPractise;

public class InternalInterviewQn {

	public static void main(String[] args) {
		//numberShiftUsingStringfunctions("988550");
		numberShift(988550);
	}

	public static void numberShiftUsingStringfunctions(String num) {
		for (int i = 0; i < num.length(); i++) {
			char lastDigit = num.charAt(num.length() - 1);
			num = lastDigit + num.substring(0, num.length() - 1);
			System.out.println("Interation"+i+" "+ num);
		}
	}

	public static void numberShift(int num) {
		int digits = String.valueOf(num).length();
		int divisor = (int) Math.pow(10, digits - 1);
		for (int i = 0; i < digits; i++) {
			int lastDigit = num % 10;
			num = lastDigit * divisor + num / 10;
			System.out.println(num);
		}
	}

}

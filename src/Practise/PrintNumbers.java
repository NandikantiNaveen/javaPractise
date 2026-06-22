package Practise;

public class PrintNumbers {

	public static void main(String[] args) {
		String s = "12345";
		int number = 12345;
		reverseNumSeries(number);
		System.out.println("**************************");
		formatNumSeries(s);
	}

	public static void formatNumSeries(String num) {
		int length = num.length();
		int position;
		for (int i = 0; i < length; i++) {
			position = length - 1 - i;
			for (int j = 0; j < length; j++) {
				System.out.print(num.charAt(position));
				position++;
				if (position == length) {
					position = 0;
				}
			}
			System.out.println();
		}
	}
	
	public static void reverseNumSeries(int n) {
		int rev = 0;
		for(;n!=0;n=n/10) {
			rev = rev*10+(n%10);
		}
		System.out.println("The Reverse of the given Num: "+rev);
	}

}

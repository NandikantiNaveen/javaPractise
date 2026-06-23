	package Practise;

public class ReverseNumber {

	public static void main(String[] args) {
		reverseNumber(123456789);
	}
	
	public static void reverseNumber(int number) {
		int rev =0;
		while(number!=0) {
			
			int remainder = number%10;
			rev = rev *10+remainder;
			number = number/10;
			

			
}
		System.out.println("The Reverse Number is:"+rev);
}
}

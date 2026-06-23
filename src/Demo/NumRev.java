package Demo;

public class NumRev {

	public static void main(String[] args) {
		System.out.println(revNumber(123));
	}

	public static int revNumber(int num) {
		int rev = 0;
		if (num == 0)
			return num;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return num;
	}

}

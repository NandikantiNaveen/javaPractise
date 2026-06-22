package Practise;

public class FindValueAfterOperation {

	public static void main(String[] args) {
		String s[] = { "--X", "X++", "X++" };
		System.out.println(valueAfterOperation(s));
	}


		public static int valueAfterOperation(String s[]) {
			int result=0;
			for (int i = 0; i < s.length; i++) {
				if(s[i].charAt(1)== '+')
					result++;
				else
					result--;
			}
			return result;
		}



}

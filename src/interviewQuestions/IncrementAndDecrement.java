package interviewQuestions;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		/*
		 * During post increment process, first of it will asign the value and
		 * increments
		 */
		System.out.println("******* Post Increment ************");
		int i = 1;
		int j = i++; // Post increment
		System.out.println(i);
		System.out.println(j);

		

		/*
		 * During pre increment process, first it will increment and then assign the
		 * value
		 */
		
		System.out.println("******** Pre Increment ***********");

		int k = 1;
		int l = ++k;
		System.out.println(k);
		System.out.println(l);

		/*
		 * During post decrement process, first of it will asign the value and
		 * decrements
		 */
		System.out.println("******** Post decrement ***********");

		int p = 1;
		int q = p--;
		System.out.println(p);
		System.out.println(q);

		/*
		 * During pre decrement process, first it will increment and then assign the
		 * value
		 */
		
		System.out.println("******** Pre decrement ***********");

		int x = 1;
		int y = --x;
		System.out.println(x);
		System.out.println(y);
		
	}

}

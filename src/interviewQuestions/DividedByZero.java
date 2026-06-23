package interviewQuestions;

public class DividedByZero {

	public static void main(String[] args) {
		try {
			System.out.println(9/0); 

		}
		catch(Exception e) {
			System.out.println(e.getStackTrace().toString());
		}
		
//		System.out.println(9.0f/0.0); //9.0
////		
//		System.out.println(10.23d/0); //10.23
////		
//		System.out.println(11.0/0); // 11
////		
//		System.out.println(0.0/0.0); // 0
////		
////		System.out.println(0.0d/0.0d); // 0.00
////		
////		System.out.println(0.0f/0.0f); // 0.0
////		
//		System.out.println(1.01d/0); // 1.01
//		

	}

}

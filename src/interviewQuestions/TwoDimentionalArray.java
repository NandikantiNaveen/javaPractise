package interviewQuestions;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		String x[][] =  new String[3][5];
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "F";

		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "F1";

		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "F2";
		
		// Print 2-D Array
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
	}

}

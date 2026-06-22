package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
	
	static Integer a[]= {1,2,null,4,5};
	String b[] = {null, "a"};

	
	int num;
	String str;
	Sample(int num){
		this.num=num;
	}
	Sample(String str){
		this.str=str;
	}
	
	public static void main(String[] args) {
		
		byte b3 = 065;
		System.out.println(b3);
		
	
		
		
		List<Integer> ar =  Arrays.asList(a);
		
		
//		Sample s = new Sample(10);
//		
//		System.out.println(s.hashCode());
//		s.num=20;
//		System.out.println(s.hashCode());
//		
//		Sample s1 = new Sample("hello");
//
//		System.out.println(s1.hashCode());
//		String s2 =  s1.str="world";
//		System.out.println(s2.hashCode());
////		int n=100;
////		System.out.println();
////		System.out.println(n++);
		
//		for(int i = 0; i< 40; i++){
//			if(i <10)
//			System.out.print("0"+i+" ");
//			else
//			System.out.print(i + " ");
//			}
		
//		for (int i = 0; i < 40; i++)
//			System.out.format("%02d ", i);
		
//		int i = 0;
//		while (i < 40) {
//
//			System.out.format("%02d ", i);
//
//			if ((i + 1) % 10 == 0)
//				System.out.println("\n");
//			i++;
//		}
		
//		For Number 1:
//			int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//			int n = arr.length - 1;
//			int i = 0;
//			while (n / 5 == 1) {
//				System.out.println(arr[i] + " + " + arr[n] + ": " + (arr[i] + arr[n]));
//				i++;
//				n--;
//			}
			
			String s = "Af%^uQ@#Z1yq23";
//			String n = s.replaceAll("[^a-zA-Z0-9]","");
//			System.out.println(n);
			String temp = "";
			System.out.println(Arrays.toString(s.toCharArray()));
			for (char c : s.toCharArray()) {

				if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
					temp = temp + c;
			}
			s = temp;
			System.out.println("Updated String: " + s);
	}
	
	

}

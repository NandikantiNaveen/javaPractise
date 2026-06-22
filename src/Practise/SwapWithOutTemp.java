package Practise;

public class SwapWithOutTemp {

	public static void main(String[] args) {
		
		int a = 50;
		int b = 40;
		System.out.println("The value of a before swap:"+a);
		System.out.println("The value of b before swap:"+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("****************************");
		
		System.out.println("The value of a after swap:"+a);
		System.out.println("The value of b after swap:"+b);

	}
	
	

}

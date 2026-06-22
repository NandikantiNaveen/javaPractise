package collections;

import java.util.Stack;

public class LearnStack {
		//LIFO - Last In First out
	
	public static void main(String[] args) {
		Stack<String> animals = new Stack<String>();
		
		animals.push("Bull");
		animals.push("Cat");
		animals.push("Tiger");
		
		System.out.println("Stack:"+animals);
		
		System.out.println(animals.peek());
		animals.pop();
		System.out.println("Stack:"+animals);
		
		
	}
}

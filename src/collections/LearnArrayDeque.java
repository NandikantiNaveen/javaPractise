package collections;

import java.util.ArrayDeque;

public class LearnArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
		
		adq.offer(10);
		adq.offerFirst(20);
		adq.offerLast(30);
		
		System.out.println(adq);
		
//		System.out.println(adq.peek());
//		System.out.println(adq.peekFirst());
//		System.out.println(adq.peekLast());
		
//		System.out.println(adq.poll());
//		System.out.println(adq);
//		System.out.println(adq.pollFirst());
//		System.out.println(adq);
		
		System.out.println(adq.pollLast());

		

		
		
	}

}

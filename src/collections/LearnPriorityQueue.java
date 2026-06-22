package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		pq.offer(11);
		pq.offer(31);
		pq.offer(21);
		pq.offer(51);
		
		System.out.println(pq);
		
		pq.poll();
		
		System.out.println(pq.peek());
		
		System.out.println(pq);
		
		
	}

}

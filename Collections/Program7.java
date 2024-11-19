package Collections;

import java.util.*;

public class Program7 {

	public static void main(String[] args) {
		// PriorityQueue
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(1);
		pq.add(10);
		pq.add(11);
		pq.add(12);
		pq.add(13);
		pq.add(14);
		
		Iterator itr=pq.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
	}

}

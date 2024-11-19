package Collections;

import java.util.*;

public class Program6 {

	public static void main(String[] args) {
		// Deque
		
		Deque<String> dq=new ArrayDeque<String>();
		
		dq.add("Roshan");
		dq.add("Nived");
		dq.add("Harikrishnan");
		dq.add("Hari");
		dq.add("Ajay");
		dq.add("Anju");
		dq.add("Chinju");
		
		System.out.println(dq);
		
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
		
		dq.removeFirst();
		dq.removeLast();
		
		System.out.println(dq.peek());
		dq.poll();
		System.out.println(dq);
		dq.offer("kunju");
		System.out.println(dq);
		System.out.println(dq.peek());
		
	}

}

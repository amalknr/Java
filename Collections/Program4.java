package Collections;

import java.util.*;

public class Program4 {

	public static void main(String[] args) {
		// Stack
		
		Stack<String> s=new Stack<String>();
		
		s.push("mango");
		s.push("mango");
		s.push("orange");
		s.push("Banana");
		s.push("Grape");
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(s);
		
		s.add("watermelon");
		
		System.out.println(s);
		
		s.pop();
		
		System.out.println(s);
		
	}

}


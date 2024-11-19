package Collections;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		// ArrayList
		
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("mango");
		list1.add("mango");
		list1.add("orange");
		list1.add("banana");
		list1.add("grape");
		
		Iterator itr=list1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(list1);
		
		list1.add(2,"Watermellon");
		System.out.println(list1);
	}

}

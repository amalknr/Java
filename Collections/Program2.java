package Collections;

import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		// LinkedList
		
		LinkedList <String> list1=new LinkedList<String>();
		
		list1.add("mango");
		list1.add("mango");
		list1.add("orange");
		list1.add("Banana");
		list1.add("Grape");
		
		Iterator itr=list1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(list1);
		
		list1.add("watermelon");
		
		System.out.println(list1);
	}

}

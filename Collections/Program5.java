package Collections;

import java.util.*;

public class Program5 {

	public static void main(String[] args) {
		// List using addAll method
		
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
		
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("watermellon");
		list2.add("orange");
		
		list1.addAll(2,list2);
		System.out.println(list1);
	}

}

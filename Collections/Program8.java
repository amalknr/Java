package Collections;

import java.util.*;

public class Program8 {

	public static void main(String[] args) {
		// HashSet
		
		HashSet<String> set=new HashSet<String>();
		
		set.add("cool");
		set.add("hii");
		set.add("cool");
		set.add("amal");
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(set);
	}

}

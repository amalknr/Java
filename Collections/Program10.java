package Collections;

import java.util.*;

public class Program10 {

	public static void main(String[] args) {
		// TreeSet
		
		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Roshan");
		set.add("Nived");
		set.add("Vishnu");
		set.add("HariKrishnan");
		set.add("Hari");
		set.add("Ajay");
		
		System.out.println(set);
		System.out.println(set.clone());
		System.out.println(set.size());
		System.out.println(set.contains("Anju"));
		System.out.println(set.isEmpty());
		System.out.println(set.first());
		System.out.println(set.last());
		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set);
		

	}

}

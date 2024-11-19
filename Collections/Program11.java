package Collections;

import java.util.*;

public class Program11 {

	public static void main(String[] args) {
		// HashMap
		
		HashMap<Integer,String> a=new HashMap<Integer,String>();
		
		a.put(1, "mango");
		a.put(2, "apple");
		a.put(3, "banana");
		a.put(4, "grapes");
		
		System.out.println("Iterating HashMap");
		
		for(Map.Entry m:a.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println(a);
	}

}

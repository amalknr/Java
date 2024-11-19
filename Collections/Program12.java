package Collections;

import java.util.*;
public class Program12 {

	public static void main(String[] args) {
		// LinkedHashMap
		
		LinkedHashMap <Integer,String> linkedHasMap=new LinkedHashMap<Integer,String>();
		
		linkedHasMap.put(3, "Three");
		linkedHasMap.put(1, "One");
		linkedHasMap.put(4, "Four");
		linkedHasMap.put(2, "Two");
		linkedHasMap.put(5, "Five");
		
		System.out.println("Iterating LinkedHashMap");
		
		for(Map.Entry m:linkedHasMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(linkedHasMap);
		
		int keyToAccess=3;
		String value = linkedHasMap.get(keyToAccess);
		System.out.println("Value for key "+keyToAccess+":"+value);
		
		int keyTocheck=6;
		boolean containsKey=linkedHasMap.containsKey(keyTocheck);
		System.out.println("contains key "+keyTocheck+" "+containsKey);
		
		System.out.println(linkedHasMap);
	}

}

package Collections;

import java.util.*;
public class Program13 {

	public static void main(String[] args) {
		// TreeMap
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		
		System.out.println(map);
		
		System.out.println("Size of the TreeMap: "+map.size());
		System.out.println("First key in the TreeMap"+map.firstKey());
		System.out.println("First Entry in the TreeMap: "+map.firstEntry());
		System.out.println("Last key in the TreeMap: "+map.lastKey());
		System.out.println("Last Entry in the TreeMap: "+map.lastEntry());
		System.out.println("Entry with key heigher than 4: "+map.higherEntry(4));
		System.out.println("Next heigher key than 4: "+map.higherKey(4));
		System.out.println("Entry with key equal to 2: "+map.ceilingEntry(2));
		System.out.println("Key equal to 3:"+map.ceilingKey(3));
		System.out.println("Entry with key equal to 4:"+map.floorEntry(4));
		System.out.println("key equal to 3: "+map.floorKey(3));
	}

}

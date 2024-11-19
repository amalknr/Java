package Collections;

import java.util.*;

public class Program3 {

	public static void main(String[] args) {
		// Vector
		
		Vector <String> v=new Vector<String>();
		
		v.add("mango");
		v.add("mango");
		v.add("orange");
		v.add("Banana");
		v.add("Grape");
		
		Iterator itr=v.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(v);
		
		v.add("watermelon");
		
		System.out.println(v);
	}

}

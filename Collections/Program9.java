package Collections;
import java.util.*;

public class Program9 {

	public static void main(String[] args) {
		// LinkedHashSet
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		set.add("David");
		set.add("Kannan");
		set.add("zakir");
		set.add("cool");
		set.add("Zakir");
		set.add("null");
		set.add("null");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		System.out.println(set.contains("zakir"));
		System.out.println(set.clone());
		System.out.println(set.contains("kripa"));
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set);
	}

}

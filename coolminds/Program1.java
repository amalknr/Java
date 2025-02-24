package coolminds;

import java.util.HashMap;

public class Program1 {

	public static void main(String[] args) {
		String str="abaacd";
		HashMap<Character,Integer> a=new HashMap<>();
		
		for(char ch: str.toCharArray()) {
			if(a.containsKey(ch)) {
				a.put(ch, a.get(ch)+1);
			}
			else {
				a.put(ch, 1);
			}
		}
		for(Character ch : a.keySet()) {
			System.out.println(ch+" "+a.get(ch));
		}

	}

}

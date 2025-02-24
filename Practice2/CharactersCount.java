package Practice2;

import java.util.*;
public class CharactersCount {

	public static void main(String[] args) {
		
		String str="aabbccdd";
		
		HashMap<Character,Integer> Has = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			
			if(Has.containsKey(ch)) {
				Has.put(ch, Has.get(ch)+1);
			}
			else {
				Has.put(ch, 1);
			}
		}
		
		for(Character ch : Has.keySet()) {
			System.out.println(ch +" "+Has.get(ch));
		}
		
	}

}

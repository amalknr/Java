package KB;
import java.util.*;

public class FindDuplicate {

	public static void main(String[] args) {
		// Count of Duplicate Characters in a String
		
		String str="programing";
		
		Map<Character,Integer> DuplicateCharacter=new HashMap<>();
		
		for(char c : str.toCharArray()) {
			DuplicateCharacter.put(c, DuplicateCharacter.getOrDefault(c,0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry: DuplicateCharacter.entrySet()) {
			if(entry.getValue()>1) {
			System.out.print(entry.getKey()+":"+entry.getValue()+" ");
			}
		}
		
		

	}

}

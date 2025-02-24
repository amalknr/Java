package coolminds;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "abacdad";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            // Check if the character is already in the map
            if (charCountMap.containsKey(ch)) {
                // If it is, increment the count by 1
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // If not, add the character to the map with count 1
                charCountMap.put(ch, 1);
            }
        }

        // Display the character counts
        for (Character ch : charCountMap.keySet()) {
            System.out.println("Character: " + ch + ", Count: " + charCountMap.get(ch));
        }
    }
}

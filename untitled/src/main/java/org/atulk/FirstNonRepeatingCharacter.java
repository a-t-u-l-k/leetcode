package org.atulk;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char getFirstNonRepeatingCharacter(String str) {
        for(char c:str.toCharArray()) {
            if(str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return 0;
    }

    public static char getFirstNonRepeatingCharacterUsingMap(String str) {
        Map<Character, Integer> counts = new HashMap<>();
        for(char c:str.toCharArray()) {
            if(counts.get(c) != null) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }
        for(char c:str.toCharArray()) {
            if(counts.get(c)==1) {
                return c;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getFirstNonRepeatingCharacter("aaabcccddd"));
        System.out.println(getFirstNonRepeatingCharacterUsingMap("aaabceccdddb"));
    }
}

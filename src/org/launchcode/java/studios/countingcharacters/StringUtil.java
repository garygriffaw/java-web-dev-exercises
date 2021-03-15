package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;

public class StringUtil {
    public static HashMap<Character, Integer> countCharacters(String text) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        char[] charactersInString = text.toCharArray();

        int count = 0;
        for(char character : charactersInString) {
            if(characterCounts.containsKey(character)) {
                count = characterCounts.get(character);
            } else {
                count = 0;
            }
            characterCounts.put(character, ++count);
        }

        return characterCounts;
    }
}

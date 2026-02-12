import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {

    public static Map<Character, Integer> getCharacterFrequency(String input) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        if (input == null) {
            return frequencyMap; // return empty map
        }

        for (char ch : input.toCharArray()) {

            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }

        return frequencyMap;
    }

    
}

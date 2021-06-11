package section03.backend;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static Map<Character, Integer> countCharacters(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Text must not be null");
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : text.toCharArray()) {

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int currentValue = map.get(c);
                map.put(c, ++currentValue);
            }

        }

        return map;
    }
}

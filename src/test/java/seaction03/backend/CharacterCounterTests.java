package seaction03.backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import section03.backend.CharacterCounter;

import java.util.Map;

public class CharacterCounterTests {

    @Test
    public void testNullInput() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CharacterCounter.countCharacters(null));
    }

    @Test
    public void testStringInput(){

        Map<Character, Integer> map = CharacterCounter.countCharacters("!a!A!");

        Assertions.assertEquals(map.size(),3);
        Assertions.assertEquals(1, map.get("a"));
        Assertions.assertEquals(3, map.get("!"));
        Assertions.assertEquals(1, map.get("A"));

    }
}

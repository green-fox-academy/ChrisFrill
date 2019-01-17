import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    Anagram object;

    @BeforeEach
    void setUp() {
        object = new Anagram();
    }

    @Test
    void testAnagramTrue() {
        assertTrue(object.anagram("dog", "god"));
    }

    @Test
    void testAnagramFalseLonger() {
        assertFalse(object.anagram("dog", "dogger"));
    }

    @Test
    void testAnagramFalseSorter() {
        assertFalse(object.anagram("dog", "dor"));
    }

    @Test
    void testAnagramTrueSorter() {
        assertFalse(object.anagram("dog", "do"));
    }

    @Test
    void testAnagramEmpty() {
        assertFalse(object.anagram("dog", ""));
    }
}
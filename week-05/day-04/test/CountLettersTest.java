import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
    private CountLetters dictionary;

    @BeforeEach
    void setUp() {
        dictionary = new CountLetters();
    }

    @Test
    void testCountLetters() {
        assertEquals(2, dictionary.countLetters("aabaacaba").get('b'));
    }

}
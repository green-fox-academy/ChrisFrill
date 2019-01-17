import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    Apple apple;

    @BeforeEach
    void setUp() {
        apple = new Apple();
    }

    @Test
    void testGetApple() {
        assertEquals("apple", apple.getApple());
    }
}
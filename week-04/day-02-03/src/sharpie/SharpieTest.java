package sharpie;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SharpieTest {
    Sharpie sharpie;

    @BeforeEach
    void setUp() {
        sharpie = new Sharpie("blue", 112);
    }

    @Test
    void testSharpieUseWithTen() {
        sharpie.use();
        assertEquals(90, sharpie.inkAmount);
    }

    @Test
    void testSharpieWidth() {
        assertEquals(112, sharpie.width);
    }

    @Test
    void testSharpietoString() {
        assertEquals("Sharpie{color='blue', width=112.0, inkAmount=100.0}", sharpie.toString());
    }

    @Test
    void testSharpieColor() {
        assertEquals("blue", sharpie.color);
    }
}
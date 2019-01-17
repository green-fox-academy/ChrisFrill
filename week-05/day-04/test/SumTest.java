import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SumTest {
    Sum object;

    @BeforeEach
    void setUp() {
        object = new Sum();
    }

    @Test
    void testSum() {
        object.add(1);
        object.add(3);
        object.add(3);
        object.add(5);
        assertEquals(12, object.sum());
    }

    @Test
    void testSumEmptyList() {
        assertEquals(  0, object.sum());
    }

    @Test
    void testSumOneElement() {
        object.add(4);
        assertEquals(4, object.sum());
    }

    @Test
    void testSumNull() {
        assertNull(object);
    }
}
package animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal animal;

    @BeforeEach
    void setUp() {
        animal = new Animal();
    }

    @Test
    void testAnimalConstuctorHunger() {
        assertEquals(50, animal.hunger);
        assertEquals(50, animal.hunger);
    }

    @Test
    void testAnimalEatDouble() {
        animal.eat();
        animal.eat();
        assertEquals(48, animal.hunger);
    }

    @Test
    void testAnimalDrink() {
        animal.drink();
        assertEquals(49, animal.thirst);
    }

    @Test
    void testAnimalPlay() {
        animal.play();
        assertEquals(51, animal.hunger);
        assertEquals(51, animal.thirst);
    }
}
package animal;

import java.util.Comparator;

public class AnimalHungerComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal first, Animal second) {
        return (second.hunger - first.hunger);
    }
}

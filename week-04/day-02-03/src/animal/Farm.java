package animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Farm {
    ArrayList<Animal> animals;
    int slots;


    public Farm() {
        animals = new ArrayList<>();
        slots = 20;
    }

    public void add(Animal animal) {
        animals.add(animal);
    }

    public Animal get(int i) {

        return animals.get(i);
    }

    public void breed() {
        if (slots > 0) {
            Animal animal = new Animal();
            animals.add(animal);
            slots--;
        }
    }

    public void slaughter() {
        AnimalHungerComparator animalHungerComparator = new AnimalHungerComparator();
        animals.sort(animalHungerComparator);
        animals.remove(0);
    }

    @Override
    public String toString() {
        return "Farm{" +
                "animals=" + animals +
                ", slots=" + slots +
                '}';
    }
}

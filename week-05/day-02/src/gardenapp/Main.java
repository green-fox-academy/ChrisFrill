package gardenapp;

public class Main {
    public static void main(String[] args) {
        Plant yellow = new Flower("yellow");
        Plant blue = new Flower("blue");
        Plant purple = new Tree("purple");
        Plant orange = new Tree("orange");

        Garden garden = new Garden();
        garden.addPlants(yellow);
        garden.addPlants(blue);
        garden.addPlants(purple);
        garden.addPlants(orange);

        System.out.println();
        garden.waterPlants(40);
        System.out.println(garden);
        System.out.println();
        garden.waterPlants(70);
        System.out.println(garden);
    }
}

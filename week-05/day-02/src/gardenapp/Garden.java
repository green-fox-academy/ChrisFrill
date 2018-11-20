package gardenapp;

import java.util.ArrayList;

public class Garden {
    private ArrayList<Plant> plants;

    public Garden() {
        plants = new ArrayList<>();
    }

    public void addPlants(Plant plant) {
        plants.add(plant);
    }

    public void waterPlants(double water) {
        double dividedWater = water / howManyIsThirsty();
        System.out.println("Watering with " + (int) water);
        for (Plant plant : plants) {
            if (plant instanceof Tree && plant.getWaterAmount() < 10) {
                plant.setWaterAmount(plant.getWaterAmount() + dividedWater / 10 * 4);
            } else if (plant instanceof Flower && plant.getWaterAmount() < 5){
                plant.setWaterAmount(plant.getWaterAmount() + dividedWater / 100 * 75);
            }
            plant.getState();
        }
    }

    public double howManyIsThirsty() {
        double counter = 0;
        for (Plant plant : plants) {
            if (plant.getWaterAmount() < plant.getThirstyLevel()) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "plants=" + plants +
                '}';
    }
}

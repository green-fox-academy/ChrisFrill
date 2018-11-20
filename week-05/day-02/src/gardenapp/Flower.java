package gardenapp;

public class Flower extends Plant {
    public Flower(){
    }

    public Flower(String color) {
        super(color);
        getState();
        setThirstyLevel(5);
    }


}

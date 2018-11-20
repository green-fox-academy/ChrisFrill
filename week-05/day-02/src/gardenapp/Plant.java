package gardenapp;

public class Plant {
    private double waterAmount;
    private String color;
    private double thirstyLevel;

    public Plant() {
    }

    public Plant(String color) {
        setColor(color);
        setWaterAmount(0);
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getState() {
        if (getWaterAmount() < getThirstyLevel()) {
            System.out.println("The " + getColor() + " " + getClass().getSimpleName() + " needs water.");
        } else {
            System.out.println("The " + getColor()  + " " + getClass().getSimpleName() + " doesn't need water.");
        }
    }

    public double getThirstyLevel() {
        return thirstyLevel;
    }

    public void setThirstyLevel(double thirstyLevel) {
        this.thirstyLevel = thirstyLevel;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "waterAmount=" + waterAmount +
                ", color='" + color + '\'' +
                '}';
    }
}

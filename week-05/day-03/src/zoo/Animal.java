package zoo;

import music.StringedInstrument;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract String breed();
    public abstract void move();
    public abstract void eat();
}

package zoo;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "getting out from it's mothers womb.";
    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }
}

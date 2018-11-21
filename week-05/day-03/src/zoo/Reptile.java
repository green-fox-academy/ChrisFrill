package zoo;

public class Reptile extends Animal{

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }
}

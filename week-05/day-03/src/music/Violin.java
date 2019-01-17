package music;

public class Violin extends StringedInstrument {
    public Violin() {
        this(4);
    }

    public Violin(int numberOfStrings) {
        super("Violin", numberOfStrings);
    }

    @Override
    public String sound() {
        return "Screech";
    }
}

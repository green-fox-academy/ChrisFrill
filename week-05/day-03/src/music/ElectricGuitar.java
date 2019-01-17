package music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
       this(6);
    }

    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", numberOfStrings);
    }

    @Override
    public String sound() {
        return "Twang";
    }
}

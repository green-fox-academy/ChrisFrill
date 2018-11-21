package music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        super("Electric Guitar", 6);
    }

    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", numberOfStrings);
    }

    @Override
    public String sound() {
        return "Twang";
    }
}

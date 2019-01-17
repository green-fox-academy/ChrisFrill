package music;

public abstract class StringedInstrument extends Instrument{
    protected int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    public abstract String sound();

    public void play() {
        System.out.printf("%s, a %d-stringed instrument that goes %s\n", name, numberOfStrings, sound());
    }
}

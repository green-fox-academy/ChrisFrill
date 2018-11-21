package gnirt;

public class Shifter implements CharSequence {
    private String string;

    public Shifter(String string, int shiftThisMany) {
        this.string = string.substring(shiftThisMany)
                + string.substring(0, shiftThisMany);
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public String toString() {
        return "Shifter{" +
                "string='" + string + '\'' +
                '}';
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;


    }
}

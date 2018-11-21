package gnirt;

public class Gnirts implements CharSequence {
    private String string;

    public Gnirts(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        StringBuilder reversedString = new StringBuilder(this.string).reverse();
        return reversedString.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}

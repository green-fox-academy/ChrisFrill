package power;

public class Power {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    public static void main(String[] args) {
        System.out.println(getPower(2, 24));
    }

    public static int getPower(int base, int n) {
        if (n == 0) {
            return 1;
        } else {
            return base * getPower(base, n-1);
        }
    }
}

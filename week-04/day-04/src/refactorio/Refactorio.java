package refactorio;

public class Refactorio {
    // Create a recursive function called `refactorio`
    // that returns it's input's factorial

    public static void main(String[] args) {
        System.out.println(getFactorial(4));

    }

    public static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }
}

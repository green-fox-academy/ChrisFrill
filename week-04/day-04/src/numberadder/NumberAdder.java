package numberadder;

public class NumberAdder {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    public static void main(String[] args) {
        System.out.println(addNumbersTill(5));
    }

    public static int addNumbersTill(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + addNumbersTill(n-1);
        }
    }
}

public class Fibonacci {
    public int getFibonacci(int index) {
        if (index <= 1) {
            return index;
        }
        return getFibonacci(index - 1) + getFibonacci(index - 2);
    }
}

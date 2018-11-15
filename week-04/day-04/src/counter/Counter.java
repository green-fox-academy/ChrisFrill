package counter;

public class Counter {

    public static void main(String[] args) {
        System.out.println(countDown(6));
    }

    public static int countDown(int n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.println(n);
            return countDown(n -1);
        }
    }
}

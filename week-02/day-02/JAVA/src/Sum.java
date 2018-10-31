import java.util.Scanner;

public class Sum {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number: ");
        int sum = scanner.nextInt();

        System.out.println(sumAll(sum));
    }

    public static int sumAll(int numbers) {
        int a = 0;
        for (int i = 0; i < numbers; i++) {
            a += i;
        }
        return a;
    }
}


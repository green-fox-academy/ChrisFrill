import java.util.Scanner;

public class ParametricAvarage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);
        int yourNumber = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i < yourNumber + 1; i++) {
            System.out.println("Please enter an integer #" + i + " : ");
            double a = scanner.nextInt();
            sum += a;
        }

        double avg = sum / yourNumber;
        System.out.println(sum);
        System.out.println(avg);

    }
}

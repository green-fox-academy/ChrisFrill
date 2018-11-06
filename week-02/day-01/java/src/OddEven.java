import java.util.Scanner;

public class OddEven {

// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

    public static void main(String[] args) {

        while (true) {
            System.out.println("Your number:");
            Scanner scanner = new Scanner(System.in);
            int yourNumber = scanner.nextInt();

            if (yourNumber % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}

import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot

        while (true) {
            System.out.println("Your number:");
            Scanner scanner = new Scanner(System.in);
            int yourNumber = scanner.nextInt();

            if (yourNumber <= 0) {
                System.out.println("Not enough");
            } else if (yourNumber == 1) {
                System.out.println("One");
            } else if (yourNumber == 2) {
                System.out.println("Two");
            } else if (yourNumber > 2) {
                System.out.println("A lot");
            }
        }

    }
}

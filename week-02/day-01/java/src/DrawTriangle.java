import java.util.Scanner;

public class DrawTriangle {

    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number: ");
        int yourNumber = scanner.nextInt();
        String star = "*";

        for (int i = 1; i < yourNumber + 1 ; i++){
            System.out.println(star);
            star += "*";
        }
    }
}

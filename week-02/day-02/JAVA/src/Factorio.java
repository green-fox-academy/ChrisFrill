import java.util.Scanner;

public class Factorio {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number: ");
        int number = scanner.nextInt();
        System.out.println(factorio(number));
    }

    public static int factorio(int factorial) {
        int result = 1;
        for (int i = 2; i < factorial + 1; i++){
            result *= i;
        }
        return result;
    }

}

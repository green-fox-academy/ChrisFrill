import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        GuessMyNum();
    }

    public static void GuessMyNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please customize the minimum value of the range: ");
        int min = scanner.nextInt();
        System.out.println("Please customize the maximum value of the range: ");
        int max = scanner.nextInt();
        Random rand = new Random();
        int random = rand.nextInt(max) + min;
        int userInput = 0;

        for (int i = 15; i > 0; i--){
            System.out.println("What could be my number? ");
            userInput = scanner.nextInt();
            if (userInput > random) {
                System.out.println("Too high. You have " + (i-1)  + " life left.");
            } else if (userInput < random) {
                System.out.println("Too low. You have " + (i-1) + " life left.");
            } else {
                System.out.println("Congrats! You won.");
                break;
            }
        }
    }
}
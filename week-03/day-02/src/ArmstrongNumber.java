import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        while (true) {
            ArmstrongNumber();
        }
    }

    public static void ArmstrongNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number: ");
        int userInput = scanner.nextInt();
        int number = userInput;
        ArrayList<Integer> numberArray = new ArrayList<>();

        while (number > 0) {
            numberArray.add(number % 10);
            number = number / 10;
        }

        ArrayList<Integer> numberOnNPower = new ArrayList<Integer>(numberArray);
        int summary = 0;
        for (int i = 0; i < numberArray.size(); i++) {
            for (int j = 1; j < numberArray.size(); j++) {
                numberOnNPower.set(i, numberOnNPower.get(i) * numberArray.get(i));
            }
            summary = summary + numberOnNPower.get(i);
        }

        if (summary == userInput) {
            System.out.println("The " + userInput + " is an Armstrong number.");
        } else {
            System.out.println("The " + userInput + " is not an Armstrong number.");
        }
    }
}
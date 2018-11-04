import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {

        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        bubble(new int[]{34, 12, 24, 9, 5});
        //  should print [5, 9, 12, 24, 34]
        advancedBubble(new int[]{34, 12, 24, 9, 5}, true);
        //  should print [34, 24, 12, 9, 5]
    }

    public static int[] bubble(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] advancedBubble(int[] array, boolean ascOrDesc) {
        int temp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to sort the list descending? (false: ascending, true: descending) ");

        do {
            try {
                ascOrDesc = scanner.nextBoolean();
                break;
            } catch (InputMismatchException ignore) {
                System.out.println("Please only enter true or false.");
                scanner.next();
            }
        } while (true);

        if (ascOrDesc) {
            for (int i = 1; i < array.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (array[j] > array[j - 1]) {
                        temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 1; i < array.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(array));
        return array;
    }
}
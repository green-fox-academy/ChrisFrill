import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Please, provide the kilometer to convert:");
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        double mile = km * 0.621371192;
        System.out.println("Your kilometers in mile: " + mile);


    }
}
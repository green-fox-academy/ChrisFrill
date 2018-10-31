import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        int a = scanner.nextInt();

        System.out.println("b: ");
        int b = scanner.nextInt();

        System.out.println("c: ");
        int c = scanner.nextInt();

        System.out.println("d: ");
        int d = scanner.nextInt();

        System.out.println("e: ");
        int e = scanner.nextInt();

        int sum = a+b+c+d+e;
        int avarage = sum/5;

        System.out.println(sum);
        System.out.println(avarage);
    }

}

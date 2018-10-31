import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        int a = scanner.nextInt();

        System.out.println("b: ");
        int b = scanner.nextInt();

        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

    }
}

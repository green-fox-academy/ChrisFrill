import java.util.Scanner;

public class Cuboid {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a side:");
        int a = scanner.nextInt();

        System.out.println("b side:");
        int b = scanner.nextInt();

        System.out.println("c side:");
        int c = scanner.nextInt();

        int surface = ((a*b)+(b*c)+(a*c))*2;
        int volume = a*b*c;

        System.out.println(surface);
        System.out.println(volume);
    }

}

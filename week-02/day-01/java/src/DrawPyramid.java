import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number: ");
        int yourNumber = scanner.nextInt();
        String star = "*";

        for(int i=0;i<yourNumber;i++) {
            for(int j=0;j<yourNumber-i;j++){
                System.out.print(" ");
            }
                System.out.println(star);
                star += "**";
            }
        }
    }
